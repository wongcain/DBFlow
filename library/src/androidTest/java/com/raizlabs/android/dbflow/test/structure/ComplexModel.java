package com.raizlabs.android.dbflow.test.structure;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.JSONModel;
import com.raizlabs.android.dbflow.structure.container.MapModel;
import com.raizlabs.android.dbflow.test.TestDatabase;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
@Table(databaseName = TestDatabase.NAME)
public class ComplexModel extends BaseModel {

    @Column(columnType = Column.PRIMARY_KEY)
    String name;

    @Column(columnType = Column.FOREIGN_KEY,
        references = {@ForeignKeyReference(columnName = "testmodel_id",
                columnType = String.class, foreignColumnName = "name")})
    JSONModel<TestModel1> testModel1;

    @Column(columnType = Column.FOREIGN_KEY,
    references = {@ForeignKeyReference(columnName = "mapmodel_id",
            columnType = String.class, foreignColumnName = "name")})
    MapModel<TestModel2> mapModel;

}
