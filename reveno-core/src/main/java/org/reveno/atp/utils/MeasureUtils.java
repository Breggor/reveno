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

package org.reveno.atp.utils;

public abstract class MeasureUtils {

	public static int kb(int number) {
		return 1024 * number;
	}
	
	public static int mb(int number) {
		return 1024 * kb(number);
	}
	
	public static long gb(int number) {
		return 1024L * mb(number);
	}

	public static long sec(int secs) {
		return secs * 1000 * 1_000_000l;
	}

	public static long sec(double secs) {
		return (long)(secs * 1000 * 1_000_000L);
	}

}
