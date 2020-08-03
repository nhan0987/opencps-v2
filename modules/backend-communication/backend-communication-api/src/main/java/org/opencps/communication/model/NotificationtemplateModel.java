/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.communication.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Notificationtemplate service. Represents a row in the &quot;opencps_notificationtemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.communication.model.impl.NotificationtemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.communication.model.impl.NotificationtemplateImpl}.
 * </p>
 *
 * @author khoavd
 * @see Notificationtemplate
 * @see org.opencps.communication.model.impl.NotificationtemplateImpl
 * @see org.opencps.communication.model.impl.NotificationtemplateModelImpl
 * @generated
 */
@ProviderType
public interface NotificationtemplateModel extends BaseModel<Notificationtemplate>,
	GroupedModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a notificationtemplate model instance should use the {@link Notificationtemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this notificationtemplate.
	 *
	 * @return the primary key of this notificationtemplate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this notificationtemplate.
	 *
	 * @param primaryKey the primary key of this notificationtemplate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the notification template ID of this notificationtemplate.
	 *
	 * @return the notification template ID of this notificationtemplate
	 */
	public long getNotificationTemplateId();

	/**
	 * Sets the notification template ID of this notificationtemplate.
	 *
	 * @param notificationTemplateId the notification template ID of this notificationtemplate
	 */
	public void setNotificationTemplateId(long notificationTemplateId);

	/**
	 * Returns the group ID of this notificationtemplate.
	 *
	 * @return the group ID of this notificationtemplate
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this notificationtemplate.
	 *
	 * @param groupId the group ID of this notificationtemplate
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this notificationtemplate.
	 *
	 * @return the company ID of this notificationtemplate
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this notificationtemplate.
	 *
	 * @param companyId the company ID of this notificationtemplate
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this notificationtemplate.
	 *
	 * @return the user ID of this notificationtemplate
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this notificationtemplate.
	 *
	 * @param userId the user ID of this notificationtemplate
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this notificationtemplate.
	 *
	 * @return the user uuid of this notificationtemplate
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this notificationtemplate.
	 *
	 * @param userUuid the user uuid of this notificationtemplate
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this notificationtemplate.
	 *
	 * @return the user name of this notificationtemplate
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this notificationtemplate.
	 *
	 * @param userName the user name of this notificationtemplate
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this notificationtemplate.
	 *
	 * @return the create date of this notificationtemplate
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this notificationtemplate.
	 *
	 * @param createDate the create date of this notificationtemplate
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this notificationtemplate.
	 *
	 * @return the modified date of this notificationtemplate
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this notificationtemplate.
	 *
	 * @param modifiedDate the modified date of this notificationtemplate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the notification type of this notificationtemplate.
	 *
	 * @return the notification type of this notificationtemplate
	 */
	@AutoEscape
	public String getNotificationType();

	/**
	 * Sets the notification type of this notificationtemplate.
	 *
	 * @param notificationType the notification type of this notificationtemplate
	 */
	public void setNotificationType(String notificationType);

	/**
	 * Returns the email subject of this notificationtemplate.
	 *
	 * @return the email subject of this notificationtemplate
	 */
	@AutoEscape
	public String getEmailSubject();

	/**
	 * Sets the email subject of this notificationtemplate.
	 *
	 * @param emailSubject the email subject of this notificationtemplate
	 */
	public void setEmailSubject(String emailSubject);

	/**
	 * Returns the email body of this notificationtemplate.
	 *
	 * @return the email body of this notificationtemplate
	 */
	@AutoEscape
	public String getEmailBody();

	/**
	 * Sets the email body of this notificationtemplate.
	 *
	 * @param emailBody the email body of this notificationtemplate
	 */
	public void setEmailBody(String emailBody);

	/**
	 * Returns the text message of this notificationtemplate.
	 *
	 * @return the text message of this notificationtemplate
	 */
	@AutoEscape
	public String getTextMessage();

	/**
	 * Sets the text message of this notificationtemplate.
	 *
	 * @param textMessage the text message of this notificationtemplate
	 */
	public void setTextMessage(String textMessage);

	/**
	 * Returns the notify message of this notificationtemplate.
	 *
	 * @return the notify message of this notificationtemplate
	 */
	@AutoEscape
	public String getNotifyMessage();

	/**
	 * Sets the notify message of this notificationtemplate.
	 *
	 * @param notifyMessage the notify message of this notificationtemplate
	 */
	public void setNotifyMessage(String notifyMessage);

	/**
	 * Returns the send sms of this notificationtemplate.
	 *
	 * @return the send sms of this notificationtemplate
	 */
	public boolean getSendSMS();

	/**
	 * Returns <code>true</code> if this notificationtemplate is send sms.
	 *
	 * @return <code>true</code> if this notificationtemplate is send sms; <code>false</code> otherwise
	 */
	public boolean isSendSMS();

	/**
	 * Sets whether this notificationtemplate is send sms.
	 *
	 * @param sendSMS the send sms of this notificationtemplate
	 */
	public void setSendSMS(boolean sendSMS);

	/**
	 * Returns the send email of this notificationtemplate.
	 *
	 * @return the send email of this notificationtemplate
	 */
	public boolean getSendEmail();

	/**
	 * Returns <code>true</code> if this notificationtemplate is send email.
	 *
	 * @return <code>true</code> if this notificationtemplate is send email; <code>false</code> otherwise
	 */
	public boolean isSendEmail();

	/**
	 * Sets whether this notificationtemplate is send email.
	 *
	 * @param sendEmail the send email of this notificationtemplate
	 */
	public void setSendEmail(boolean sendEmail);

	/**
	 * Returns the send notification of this notificationtemplate.
	 *
	 * @return the send notification of this notificationtemplate
	 */
	public boolean getSendNotification();

	/**
	 * Returns <code>true</code> if this notificationtemplate is send notification.
	 *
	 * @return <code>true</code> if this notificationtemplate is send notification; <code>false</code> otherwise
	 */
	public boolean isSendNotification();

	/**
	 * Sets whether this notificationtemplate is send notification.
	 *
	 * @param sendNotification the send notification of this notificationtemplate
	 */
	public void setSendNotification(boolean sendNotification);

	/**
	 * Returns the expire duration of this notificationtemplate.
	 *
	 * @return the expire duration of this notificationtemplate
	 */
	public int getExpireDuration();

	/**
	 * Sets the expire duration of this notificationtemplate.
	 *
	 * @param expireDuration the expire duration of this notificationtemplate
	 */
	public void setExpireDuration(int expireDuration);

	/**
	 * Returns the user url pattern of this notificationtemplate.
	 *
	 * @return the user url pattern of this notificationtemplate
	 */
	@AutoEscape
	public String getUserUrlPattern();

	/**
	 * Sets the user url pattern of this notificationtemplate.
	 *
	 * @param userUrlPattern the user url pattern of this notificationtemplate
	 */
	public void setUserUrlPattern(String userUrlPattern);

	/**
	 * Returns the guest url pattern of this notificationtemplate.
	 *
	 * @return the guest url pattern of this notificationtemplate
	 */
	@AutoEscape
	public String getGuestUrlPattern();

	/**
	 * Sets the guest url pattern of this notificationtemplate.
	 *
	 * @param guestUrlPattern the guest url pattern of this notificationtemplate
	 */
	public void setGuestUrlPattern(String guestUrlPattern);

	/**
	 * Returns the interval of this notificationtemplate.
	 *
	 * @return the interval of this notificationtemplate
	 */
	@AutoEscape
	public String getInterval();

	/**
	 * Sets the interval of this notificationtemplate.
	 *
	 * @param interval the interval of this notificationtemplate
	 */
	public void setInterval(String interval);

	/**
	 * Returns the grouping of this notificationtemplate.
	 *
	 * @return the grouping of this notificationtemplate
	 */
	public boolean getGrouping();

	/**
	 * Returns <code>true</code> if this notificationtemplate is grouping.
	 *
	 * @return <code>true</code> if this notificationtemplate is grouping; <code>false</code> otherwise
	 */
	public boolean isGrouping();

	/**
	 * Sets whether this notificationtemplate is grouping.
	 *
	 * @param grouping the grouping of this notificationtemplate
	 */
	public void setGrouping(boolean grouping);

	/**
	 * Returns the priority of this notificationtemplate.
	 *
	 * @return the priority of this notificationtemplate
	 */
	public int getPriority();

	/**
	 * Sets the priority of this notificationtemplate.
	 *
	 * @param priority the priority of this notificationtemplate
	 */
	public void setPriority(int priority);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Notificationtemplate notificationtemplate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Notificationtemplate> toCacheModel();

	@Override
	public Notificationtemplate toEscapedModel();

	@Override
	public Notificationtemplate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}