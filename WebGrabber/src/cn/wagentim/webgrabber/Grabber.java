package cn.wagentim.webgrabber;

import cn.wagentim.sitecollections.sites.Site;
import cn.wagentim.webgrabber.rules.Rule;

public interface Grabber
{
	void grab(final Site site, final Rule rule);
}
