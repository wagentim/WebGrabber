package cn.wagentim.webgrabber;

import cn.wagentim.sitecollections.sites.Site;
import cn.wagentim.sitecollections.utils.Utils;

public class StandardGrabber implements Grabber
{

	@Override
	public void grab(Site site)
	{
		if( Utils.isInvalidSite(site) )
		{
			// TODO using log
			return;
		}

	}

}
