//
//  CDVOpenStoreUpdate.m
//
//
//

#import "CDVOpenStoreUpdate.h"

@implementation CDVOpenStoreUpdate
    
- (void)go:(CDVInvokedUrlCommand*)command
{
    NSString *appname = [command argumentAtIndex:0];
	NSString *link =  [@"itms-apps://itunes.com/apps/" : appname];
	[[UIApplication sharedApplication] openURL:[NSURL URLWithString:link];
}

@end
