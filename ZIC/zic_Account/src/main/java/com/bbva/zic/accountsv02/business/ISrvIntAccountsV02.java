package com.bbva.zic.accountsv02.business;

import com.bbva.zic.accountsv02.business.dto.DTOIntAccount;

public interface ISrvIntAccountsV02 {
	public DTOIntAccount getAccount(String accountId, String fileds);

	public DTOIntAccount prospectAccountNumber(DTOIntAccount dtoIntAccount);

}