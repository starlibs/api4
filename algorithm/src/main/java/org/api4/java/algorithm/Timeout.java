package org.api4.java.algorithm;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * A standard utility class to express and convert timeouts
 *
 * @author Marcel Wever
 *
 */
public class Timeout implements Serializable {
	private static final long serialVersionUID = -3299312927082008461L;
	private final TimeUnit unit;
	private final long duration;

	public Timeout(final long duration, final TimeUnit unit) {
		this.duration = duration;
		this.unit = unit;
	}

	public long nanoseconds() {
		return TimeUnit.NANOSECONDS.convert(this.duration, this.unit);
	}

	public long milliseconds() {
		return TimeUnit.MILLISECONDS.convert(this.duration, this.unit);
	}

	public long minutes() {
		return TimeUnit.MINUTES.convert(this.duration, this.unit);
	}

	public long seconds() {
		return TimeUnit.SECONDS.convert(this.duration, this.unit);
	}

	public long hours() {
		return TimeUnit.HOURS.convert(this.duration, this.unit);
	}

	public long days() {
		return TimeUnit.DAYS.convert(this.duration, this.unit);
	}

	@Override
	public String toString() {
		return this.milliseconds() + "ms";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.duration ^ (this.duration >>> 32));
		result = prime * result + ((this.unit == null) ? 0 : this.unit.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Timeout other = (Timeout) obj;
		if (this.duration != other.duration) {
			return false;
		}
		return this.unit == other.unit;
	}
}
