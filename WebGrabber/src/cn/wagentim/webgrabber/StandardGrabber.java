package cn.wagentim.webgrabber;

import cn.wagentim.basicutils.BasicUtils;
import cn.wagentim.connecthelper.core.ConnectManager;
import cn.wagentim.sitecollections.sites.Site;
import cn.wagentim.sitecollections.utils.Utils;
import cn.wagentim.webgrabber.rules.Rule;
import de.wagentim.qlogger.channel.LogChannel;
import de.wagentim.qlogger.logger.Log;

public class StandardGrabber implements Grabber
{
	private final ConnectManager manager = new ConnectManager();
	private final LogChannel logger = Constants.logger;

	@Override
	public void grab(final Site site, final Rule rule)
	{
		if( Utils.isInvalidSite(site) )
		{
			logger.log(Log.LEVEL_INFO, "Invalid Site: " + site.toString());
			return;
		}
	}

}
