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

package user.entelgy.data.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import user.entelgy.data.service.exception.NoSuchUserEntelgyException;
import user.entelgy.data.service.model.UserEntelgy;
import user.entelgy.data.service.model.UserEntelgyTable;
import user.entelgy.data.service.model.impl.UserEntelgyImpl;
import user.entelgy.data.service.model.impl.UserEntelgyModelImpl;
import user.entelgy.data.service.service.persistence.UserEntelgyPersistence;
import user.entelgy.data.service.service.persistence.UserEntelgyUtil;
import user.entelgy.data.service.service.persistence.impl.constants.ENTELGYUSERPersistenceConstants;

/**
 * The persistence implementation for the user entelgy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UserEntelgyPersistence.class)
public class UserEntelgyPersistenceImpl
	extends BasePersistenceImpl<UserEntelgy> implements UserEntelgyPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UserEntelgyUtil</code> to access the user entelgy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UserEntelgyImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByActiveUser;
	private FinderPath _finderPathWithoutPaginationFindByActiveUser;
	private FinderPath _finderPathCountByActiveUser;

	/**
	 * Returns all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the matching user entelgies
	 */
	@Override
	public List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId) {

		return findByActiveUser(
			activeUser, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @return the range of matching user entelgies
	 */
	@Override
	public List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end) {

		return findByActiveUser(activeUser, groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user entelgies
	 */
	@Override
	public List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		OrderByComparator<UserEntelgy> orderByComparator) {

		return findByActiveUser(
			activeUser, groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user entelgies
	 */
	@Override
	public List<UserEntelgy> findByActiveUser(
		Boolean activeUser, long groupId, int start, int end,
		OrderByComparator<UserEntelgy> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByActiveUser;
				finderArgs = new Object[] {activeUser, groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByActiveUser;
			finderArgs = new Object[] {
				activeUser, groupId, start, end, orderByComparator
			};
		}

		List<UserEntelgy> list = null;

		if (useFinderCache) {
			list = (List<UserEntelgy>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserEntelgy userEntelgy : list) {
					if (!Objects.equals(
							activeUser, userEntelgy.getActiveUser()) ||
						(groupId != userEntelgy.getGroupId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_USERENTELGY_WHERE);

			sb.append(_FINDER_COLUMN_ACTIVEUSER_ACTIVEUSER_2);

			sb.append(_FINDER_COLUMN_ACTIVEUSER_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UserEntelgyModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(activeUser.booleanValue());

				queryPos.add(groupId);

				list = (List<UserEntelgy>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	@Override
	public UserEntelgy findByActiveUser_First(
			Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws NoSuchUserEntelgyException {

		UserEntelgy userEntelgy = fetchByActiveUser_First(
			activeUser, groupId, orderByComparator);

		if (userEntelgy != null) {
			return userEntelgy;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("activeUser=");
		sb.append(activeUser);

		sb.append(", groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchUserEntelgyException(sb.toString());
	}

	/**
	 * Returns the first user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	@Override
	public UserEntelgy fetchByActiveUser_First(
		Boolean activeUser, long groupId,
		OrderByComparator<UserEntelgy> orderByComparator) {

		List<UserEntelgy> list = findByActiveUser(
			activeUser, groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy
	 * @throws NoSuchUserEntelgyException if a matching user entelgy could not be found
	 */
	@Override
	public UserEntelgy findByActiveUser_Last(
			Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws NoSuchUserEntelgyException {

		UserEntelgy userEntelgy = fetchByActiveUser_Last(
			activeUser, groupId, orderByComparator);

		if (userEntelgy != null) {
			return userEntelgy;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("activeUser=");
		sb.append(activeUser);

		sb.append(", groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchUserEntelgyException(sb.toString());
	}

	/**
	 * Returns the last user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user entelgy, or <code>null</code> if a matching user entelgy could not be found
	 */
	@Override
	public UserEntelgy fetchByActiveUser_Last(
		Boolean activeUser, long groupId,
		OrderByComparator<UserEntelgy> orderByComparator) {

		int count = countByActiveUser(activeUser, groupId);

		if (count == 0) {
			return null;
		}

		List<UserEntelgy> list = findByActiveUser(
			activeUser, groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user entelgies before and after the current user entelgy in the ordered set where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param userEntelgyId the primary key of the current user entelgy
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy[] findByActiveUser_PrevAndNext(
			long userEntelgyId, Boolean activeUser, long groupId,
			OrderByComparator<UserEntelgy> orderByComparator)
		throws NoSuchUserEntelgyException {

		UserEntelgy userEntelgy = findByPrimaryKey(userEntelgyId);

		Session session = null;

		try {
			session = openSession();

			UserEntelgy[] array = new UserEntelgyImpl[3];

			array[0] = getByActiveUser_PrevAndNext(
				session, userEntelgy, activeUser, groupId, orderByComparator,
				true);

			array[1] = userEntelgy;

			array[2] = getByActiveUser_PrevAndNext(
				session, userEntelgy, activeUser, groupId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserEntelgy getByActiveUser_PrevAndNext(
		Session session, UserEntelgy userEntelgy, Boolean activeUser,
		long groupId, OrderByComparator<UserEntelgy> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_USERENTELGY_WHERE);

		sb.append(_FINDER_COLUMN_ACTIVEUSER_ACTIVEUSER_2);

		sb.append(_FINDER_COLUMN_ACTIVEUSER_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(UserEntelgyModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(activeUser.booleanValue());

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userEntelgy)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UserEntelgy> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user entelgies where activeUser = &#63; and groupId = &#63; from the database.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 */
	@Override
	public void removeByActiveUser(Boolean activeUser, long groupId) {
		for (UserEntelgy userEntelgy :
				findByActiveUser(
					activeUser, groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(userEntelgy);
		}
	}

	/**
	 * Returns the number of user entelgies where activeUser = &#63; and groupId = &#63;.
	 *
	 * @param activeUser the active user
	 * @param groupId the group ID
	 * @return the number of matching user entelgies
	 */
	@Override
	public int countByActiveUser(Boolean activeUser, long groupId) {
		FinderPath finderPath = _finderPathCountByActiveUser;

		Object[] finderArgs = new Object[] {activeUser, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_USERENTELGY_WHERE);

			sb.append(_FINDER_COLUMN_ACTIVEUSER_ACTIVEUSER_2);

			sb.append(_FINDER_COLUMN_ACTIVEUSER_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(activeUser.booleanValue());

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ACTIVEUSER_ACTIVEUSER_2 =
		"userEntelgy.activeUser = ? AND ";

	private static final String _FINDER_COLUMN_ACTIVEUSER_GROUPID_2 =
		"userEntelgy.groupId = ?";

	public UserEntelgyPersistenceImpl() {
		setModelClass(UserEntelgy.class);

		setModelImplClass(UserEntelgyImpl.class);
		setModelPKClass(long.class);

		setTable(UserEntelgyTable.INSTANCE);
	}

	/**
	 * Caches the user entelgy in the entity cache if it is enabled.
	 *
	 * @param userEntelgy the user entelgy
	 */
	@Override
	public void cacheResult(UserEntelgy userEntelgy) {
		entityCache.putResult(
			UserEntelgyImpl.class, userEntelgy.getPrimaryKey(), userEntelgy);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the user entelgies in the entity cache if it is enabled.
	 *
	 * @param userEntelgies the user entelgies
	 */
	@Override
	public void cacheResult(List<UserEntelgy> userEntelgies) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (userEntelgies.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (UserEntelgy userEntelgy : userEntelgies) {
			if (entityCache.getResult(
					UserEntelgyImpl.class, userEntelgy.getPrimaryKey()) ==
						null) {

				cacheResult(userEntelgy);
			}
		}
	}

	/**
	 * Clears the cache for all user entelgies.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserEntelgyImpl.class);

		finderCache.clearCache(UserEntelgyImpl.class);
	}

	/**
	 * Clears the cache for the user entelgy.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserEntelgy userEntelgy) {
		entityCache.removeResult(UserEntelgyImpl.class, userEntelgy);
	}

	@Override
	public void clearCache(List<UserEntelgy> userEntelgies) {
		for (UserEntelgy userEntelgy : userEntelgies) {
			entityCache.removeResult(UserEntelgyImpl.class, userEntelgy);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(UserEntelgyImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(UserEntelgyImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new user entelgy with the primary key. Does not add the user entelgy to the database.
	 *
	 * @param userEntelgyId the primary key for the new user entelgy
	 * @return the new user entelgy
	 */
	@Override
	public UserEntelgy create(long userEntelgyId) {
		UserEntelgy userEntelgy = new UserEntelgyImpl();

		userEntelgy.setNew(true);
		userEntelgy.setPrimaryKey(userEntelgyId);

		userEntelgy.setCompanyId(CompanyThreadLocal.getCompanyId());

		return userEntelgy;
	}

	/**
	 * Removes the user entelgy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy that was removed
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy remove(long userEntelgyId)
		throws NoSuchUserEntelgyException {

		return remove((Serializable)userEntelgyId);
	}

	/**
	 * Removes the user entelgy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user entelgy
	 * @return the user entelgy that was removed
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy remove(Serializable primaryKey)
		throws NoSuchUserEntelgyException {

		Session session = null;

		try {
			session = openSession();

			UserEntelgy userEntelgy = (UserEntelgy)session.get(
				UserEntelgyImpl.class, primaryKey);

			if (userEntelgy == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserEntelgyException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(userEntelgy);
		}
		catch (NoSuchUserEntelgyException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserEntelgy removeImpl(UserEntelgy userEntelgy) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userEntelgy)) {
				userEntelgy = (UserEntelgy)session.get(
					UserEntelgyImpl.class, userEntelgy.getPrimaryKeyObj());
			}

			if (userEntelgy != null) {
				session.delete(userEntelgy);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (userEntelgy != null) {
			clearCache(userEntelgy);
		}

		return userEntelgy;
	}

	@Override
	public UserEntelgy updateImpl(UserEntelgy userEntelgy) {
		boolean isNew = userEntelgy.isNew();

		if (!(userEntelgy instanceof UserEntelgyModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(userEntelgy.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(userEntelgy);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in userEntelgy proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UserEntelgy implementation " +
					userEntelgy.getClass());
		}

		UserEntelgyModelImpl userEntelgyModelImpl =
			(UserEntelgyModelImpl)userEntelgy;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (userEntelgy.getCreateDate() == null)) {
			if (serviceContext == null) {
				userEntelgy.setCreateDate(date);
			}
			else {
				userEntelgy.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!userEntelgyModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				userEntelgy.setModifiedDate(date);
			}
			else {
				userEntelgy.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(userEntelgy);
			}
			else {
				userEntelgy = (UserEntelgy)session.merge(userEntelgy);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			UserEntelgyImpl.class, userEntelgyModelImpl, false, true);

		if (isNew) {
			userEntelgy.setNew(false);
		}

		userEntelgy.resetOriginalValues();

		return userEntelgy;
	}

	/**
	 * Returns the user entelgy with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user entelgy
	 * @return the user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserEntelgyException {

		UserEntelgy userEntelgy = fetchByPrimaryKey(primaryKey);

		if (userEntelgy == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserEntelgyException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return userEntelgy;
	}

	/**
	 * Returns the user entelgy with the primary key or throws a <code>NoSuchUserEntelgyException</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy
	 * @throws NoSuchUserEntelgyException if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy findByPrimaryKey(long userEntelgyId)
		throws NoSuchUserEntelgyException {

		return findByPrimaryKey((Serializable)userEntelgyId);
	}

	/**
	 * Returns the user entelgy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEntelgyId the primary key of the user entelgy
	 * @return the user entelgy, or <code>null</code> if a user entelgy with the primary key could not be found
	 */
	@Override
	public UserEntelgy fetchByPrimaryKey(long userEntelgyId) {
		return fetchByPrimaryKey((Serializable)userEntelgyId);
	}

	/**
	 * Returns all the user entelgies.
	 *
	 * @return the user entelgies
	 */
	@Override
	public List<UserEntelgy> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @return the range of user entelgies
	 */
	@Override
	public List<UserEntelgy> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user entelgies
	 */
	@Override
	public List<UserEntelgy> findAll(
		int start, int end, OrderByComparator<UserEntelgy> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user entelgies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEntelgyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user entelgies
	 * @param end the upper bound of the range of user entelgies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user entelgies
	 */
	@Override
	public List<UserEntelgy> findAll(
		int start, int end, OrderByComparator<UserEntelgy> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<UserEntelgy> list = null;

		if (useFinderCache) {
			list = (List<UserEntelgy>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_USERENTELGY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_USERENTELGY;

				sql = sql.concat(UserEntelgyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UserEntelgy>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user entelgies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserEntelgy userEntelgy : findAll()) {
			remove(userEntelgy);
		}
	}

	/**
	 * Returns the number of user entelgies.
	 *
	 * @return the number of user entelgies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_USERENTELGY);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "userEntelgyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USERENTELGY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UserEntelgyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user entelgy persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByActiveUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActiveUser",
			new String[] {
				Boolean.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"activeUser", "groupId"}, true);

		_finderPathWithoutPaginationFindByActiveUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActiveUser",
			new String[] {Boolean.class.getName(), Long.class.getName()},
			new String[] {"activeUser", "groupId"}, true);

		_finderPathCountByActiveUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActiveUser",
			new String[] {Boolean.class.getName(), Long.class.getName()},
			new String[] {"activeUser", "groupId"}, false);

		_setUserEntelgyUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setUserEntelgyUtilPersistence(null);

		entityCache.removeCache(UserEntelgyImpl.class.getName());
	}

	private void _setUserEntelgyUtilPersistence(
		UserEntelgyPersistence userEntelgyPersistence) {

		try {
			Field field = UserEntelgyUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, userEntelgyPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = ENTELGYUSERPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ENTELGYUSERPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ENTELGYUSERPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_USERENTELGY =
		"SELECT userEntelgy FROM UserEntelgy userEntelgy";

	private static final String _SQL_SELECT_USERENTELGY_WHERE =
		"SELECT userEntelgy FROM UserEntelgy userEntelgy WHERE ";

	private static final String _SQL_COUNT_USERENTELGY =
		"SELECT COUNT(userEntelgy) FROM UserEntelgy userEntelgy";

	private static final String _SQL_COUNT_USERENTELGY_WHERE =
		"SELECT COUNT(userEntelgy) FROM UserEntelgy userEntelgy WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "userEntelgy.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UserEntelgy exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UserEntelgy exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UserEntelgyPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}