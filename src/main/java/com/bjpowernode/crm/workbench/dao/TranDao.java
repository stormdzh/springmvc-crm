package com.bjpowernode.crm.workbench.dao;

import com.bjpowernode.crm.workbench.domain.Tran;

public interface TranDao {

    int save(Tran t);

    Tran getTranById(String id);

    int changeStage(Tran t);
}
