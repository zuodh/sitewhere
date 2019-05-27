/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.grpc.client.spi;

import com.sitewhere.grpc.client.GrpcChannel;
import com.sitewhere.spi.server.lifecycle.ITenantEngineLifecycleComponent;

/**
 * Common interface for GRPC channels that handle API calls.
 * 
 * @author Derek
 */
public interface IApiChannel<T extends GrpcChannel<?, ?>> extends ITenantEngineLifecycleComponent {

    /**
     * Get target hostname .
     * 
     * @return
     */
    public String getHostname();

    /**
     * Get target port.
     * 
     * @return
     */
    public int getPort();

    /**
     * Create underlying GRPC channel.
     * 
     * @param host
     * @param port
     * @return
     */
    public T createGrpcChannel(String host, int port);

    /**
     * Get underlying GRPC channel.
     * 
     * @return
     */
    public T getGrpcChannel();
}