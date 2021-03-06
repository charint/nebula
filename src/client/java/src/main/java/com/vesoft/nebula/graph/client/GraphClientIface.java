/* Copyright (c) 2018 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.graph.client;

public interface GraphClientIface {

    //This interface will be inherited by blocking and non-blocking clients..
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    public static final int DEFAULT_CONNECTION_RETRY_SIZE = 3;

    public int connect(String username, String password);

    public void disconnect();

    public int execute(String stmt);

    public int executeUpdate(String stmt);

    public ResultSet executeQuery(String stmt);
}
