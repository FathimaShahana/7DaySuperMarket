package dataProvider7rMartAdminUsersAdding;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utils.ExcelUtility;
import utils.RandomGenerators;

public class DataproviderForUsers {

	@DataProvider(name = "dataprovider1")
	public Object[][] getSignInData() {
		Object[][] obj = { { "fathima_" + RandomGenerators.randomNumbers(), "123456", "Admin" },
				{ "fathima_" + RandomGenerators.randomNumbers(), "654321", "Partner" },
				{ "fathima_" + RandomGenerators.randomNumbers(), "678905", "Staff" },
				{ "fathima_" + RandomGenerators.randomNumbers(), "987654", "Admin" },
				{ "fathima_" + RandomGenerators.randomNumbers(), "456789", "Delivery Boy" } };

		return obj;
	}

	@DataProvider(name = "excelread")
	public Object[][] getUsersData() throws IOException {
		return ExcelUtility.ReadData(DataProviderSettings.usersExcelPath, DataProviderSettings.usersExcelSheet);

	}

}
