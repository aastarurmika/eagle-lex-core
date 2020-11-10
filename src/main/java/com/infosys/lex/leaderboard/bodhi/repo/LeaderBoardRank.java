/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
package com.infosys.lex.leaderboard.bodhi.repo;

import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("leaderboard_rank")
public class LeaderBoardRank {
	
	@PrimaryKey
	private LeaderBoardRankPrimaryKey leaderBoardRankKey;
	
	@Column("end_date")
	private Date endDate;
	
	@Column("points")
	private Integer points;
	
	public LeaderBoardRankPrimaryKey getLeaderBoardRankKey() {
		return leaderBoardRankKey;
	}

	public void setLeaderBoardRankKey(LeaderBoardRankPrimaryKey leaderBoardRankKey) {
		this.leaderBoardRankKey = leaderBoardRankKey;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column("start_date")
	private Date startDate;

}
