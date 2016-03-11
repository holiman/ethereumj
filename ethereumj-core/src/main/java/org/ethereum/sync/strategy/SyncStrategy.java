package org.ethereum.sync.strategy;

import org.ethereum.sync.SyncState;

/**
 * Interface of sync strategy<br/>
 *
 * Strategy encapsulates sync state management
 * and rules sync by a certain algorithm
 *
 * @author Mikhail Kalinin
 * @since 02.02.2016
 */
public interface SyncStrategy {

    void start();

    void stop();

    boolean inProgress();

    SyncState getState();
}
