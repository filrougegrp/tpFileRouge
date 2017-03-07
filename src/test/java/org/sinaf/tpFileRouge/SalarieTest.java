package org.sinaf.tpFileRouge;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class SalarieTest extends APronosticTest {

	@Test
	public void shoudReturnAllPays() {

	}

	@Test
	public void shoudReturnBadouchWhereFindSalarieById() throws SQLException {
		Statement stm = connection.createStatement();
		ResultSet rset = stm.executeQuery("SELECT * FROM PAYS");
		assertThat(rset).isNotNull();
		while (rset.next()) {
			System.out.println(rset.getString(2));
		}
	}

	@Test
	public void shoudReturnn() throws SQLException {
		PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM SALARIE WHERE ID_SALARIE = ? ");
		pstmt.setLong(1, 1L);
		ResultSet rset = pstmt.executeQuery();
		rset.next();
		assertThat(rset.getString(2)).isEqualTo("Badouch");

	}

}
