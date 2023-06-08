package com.whatsapp.service;

import com.whatsapp.model.Status;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

/**
 * Implements the StatusService interface and provides the status functionality
 *
 * @version 1.0
 * @author Anisha Brightlin
 */
public class StatusServiceImpl implements StatusService {

    private final List<Status> statusList = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    public String putStatus(final Status status) {
        statusList.add(status);

        return status.getStatus();
    }

    /**
     * {@inheritDoc}
     */
    public boolean isExpired(final Date time) {
        final Date currentTime = new Date();

        return currentTime.after(time) ? true :false;
    }
}