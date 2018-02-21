package org.prometheus_core.service.common_file_management_service.model.config;

import org.prometheus_core.service.common_file_management_service.model.management.TimeUnit;

/**
 * R
 */
public class AbstractArchiveConfiguration {

    /**
     * if these compressAfter and compressandMove aftter
     * are same values and types, then do compressAndMove process
     *
     * or if compressAfter is simply null
     */
    private int compressAfterValue;
    private TimeUnit compressAfterUnitType;

    private int compressAndMoveAfterValue;
    private TimeUnit compressAndMoveAfterUnitType;

    /**
     * When to remove data from management folder.
     */
    private int retentionPeriodValue;
    private TimeUnit retentionPeriodUnitType;


}
