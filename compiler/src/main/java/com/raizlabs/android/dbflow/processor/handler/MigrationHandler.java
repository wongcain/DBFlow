package com.raizlabs.android.dbflow.processor.handler;

import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.processor.definition.MigrationDefinition;
import com.raizlabs.android.dbflow.processor.model.ProcessorManager;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
public class MigrationHandler extends BaseContainerHandler<Migration> {

    @Override
    protected Class<Migration> getAnnotationClass() {
        return Migration.class;
    }

    @Override
    protected void onProcessElement(ProcessorManager processorManager, Element element) {
        MigrationDefinition migrationDefinition = new MigrationDefinition(processorManager, (TypeElement) element);
        processorManager.addMigrationDefinition(migrationDefinition);
    }
}
