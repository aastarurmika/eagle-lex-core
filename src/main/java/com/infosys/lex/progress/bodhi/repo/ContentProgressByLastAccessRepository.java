/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
/**
© 2017 - 2019 Infosys Limited, Bangalore, India. All Rights Reserved. 
Version: 1.10

Except for any free or open source software components embedded in this Infosys proprietary software program (“Program”),
this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India,
the United States and other countries. Except as expressly permitted, any unauthorized reproduction, storage, transmission in any form or
by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), or any distribution of 
this Program, or any portion of it, may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible
under the law.

Highly Confidential
 
*/
package com.infosys.lex.progress.bodhi.repo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentProgressByLastAccessRepository extends
CassandraRepository<ContentProgressByLastAccessModel, ContentProgressByLastAccessPrimaryKeyModel> {

	/**
	 * gets the top 50 active users for the given content ids
	 * @param contentIds
	 * @param lastTs
	 * @return
	 */

	@Query("Select * from user_content_progress_by_last_accessed_on where content_id in ?0 and root_org = ?1 and last_accessed_on > ?2 limit 50;")
	public List<Map<String, Object>> findActiveUsers(List<String> contentIds,String rootOrg, Date lastTs);
}
