/*
 * ao-appcluster-all - Convenience POM to include all application-level clustering tools.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-appcluster-all.
 *
 * ao-appcluster-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-appcluster-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-appcluster-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.aoapps.appcluster.all {
	// Direct
	requires transitive com.aoapps.appcluster.core; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-core</artifactId>
	requires transitive com.aoapps.appcluster.csync2; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-csync2</artifactId>
	requires transitive com.aoapps.appcluster.dnsonly; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-dnsonly</artifactId>
	requires transitive com.aoapps.appcluster.imap; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-imap</artifactId>
	requires transitive com.aoapps.appcluster.jdbc; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-jdbc</artifactId>
}
