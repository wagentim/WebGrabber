package cn.wagentim.webgrabber;

import de.wagentim.qlogger.channel.DefaultChannel;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.service.QLoggerService;

public class Constants
{
	public static final LogChannel logger = QLoggerService.getChannel(QLoggerService.addChannel(new DefaultChannel("Grabber")));
}
