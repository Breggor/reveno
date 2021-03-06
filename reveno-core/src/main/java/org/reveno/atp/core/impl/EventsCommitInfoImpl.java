/** 
 *  Copyright (c) 2015 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.reveno.atp.core.impl;

import org.reveno.atp.core.api.EventsCommitInfo;

public class EventsCommitInfoImpl implements EventsCommitInfo {

	private long transactionId;
	public long transactionId() {
		return transactionId;
	}
	public void setTransactionId(final long transactionId) {
		this.transactionId = transactionId;
	}

	private long time;
	public long time() {
		return time;
	}
	public void setTime(final long time) {
		this.time = time;
	}
	
	private long flag;
	public long flag() {
		return flag;
	}
	public void setFlag(final long flag) {
		this.flag = flag;
	}
	
	
	public static class PojoBuilder implements EventsCommitInfo.Builder {
		@Override
		public EventsCommitInfo create(long txId, long time, long flag) {
			EventsCommitInfoImpl impl = new EventsCommitInfoImpl();
			impl.setTransactionId(txId);
			impl.setTime(time);
			impl.setFlag(flag);
			return impl;
		}
	}
	
}
