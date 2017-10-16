/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.marketpay.notification;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteNotificationConfigurationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-11T12:23:08.541Z")
public class DeleteNotificationConfigurationRequest {
    @SerializedName("notificationIds")
    private List<Long> notificationIds = null;

    public DeleteNotificationConfigurationRequest notificationIds(List<Long> notificationIds) {
        this.notificationIds = notificationIds;
        return this;
    }

    public DeleteNotificationConfigurationRequest addNotificationIdsItem(Long notificationIdsItem) {
        if (this.notificationIds == null) {
            this.notificationIds = new ArrayList<Long>();
        }
        this.notificationIds.add(notificationIdsItem);
        return this;
    }

    /**
     * IDs of the notification configurations to be deleted
     *
     * @return notificationIds
     **/
    public List<Long> getNotificationIds() {
        return notificationIds;
    }

    public void setNotificationIds(List<Long> notificationIds) {
        this.notificationIds = notificationIds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest = (DeleteNotificationConfigurationRequest) o;
        return Objects.equals(this.notificationIds, deleteNotificationConfigurationRequest.notificationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationIds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNotificationConfigurationRequest {\n");

        sb.append("    notificationIds: ").append(toIndentedString(notificationIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

