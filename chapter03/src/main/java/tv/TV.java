package tv;

public class TV {
	private int channel;// 0~250 rotation
	private int volume; // 0~100까지 rotation로테이션으로 돌리기
	private boolean power;

	public TV(int ch, int vo, boolean po) {
		this.channel = ch;
		this.volume = vo;
		this.power = po;
	}

	public void volume(boolean up) {
		if (volume >= 100) {
			volume = 100;
		} else if (volume < 0) {
			volume = 100;
		}
		volume(volume + (up ? 1 : -1));
		
	}

	public void volume(int volume) {
		this.volume = volume;
		if (volume > 100) {
			volume = 100;
		} else if (volume < 0) {
			volume = 100;
		}
		this.volume = volume;
	}

	public void channel(boolean up) {
		channel(channel + (up ? +1 : -1));
	}

	public void channel(int channel) {
		this.channel = channel;
		if (channel > 255) {
			channel = 1;
		} else if (channel < 1) {
			channel = 255;
		}
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;

	}

	public void power(boolean on) {
		if (on) {
			power=true;
		} else {
			power=false;
		}

	}

	public void status() {
		System.out.println("TV[channe:" + channel + ", volume:" + volume + ", power=" + (power ? "on" : "off"));
	}
}
