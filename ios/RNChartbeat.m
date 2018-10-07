
#import "RNChartbeat.h"
#import "CBTracker.h"

@implementation RNChartbeat

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(setupTrackerWithAccountId:(int)uid domain:(NSString *)domain) {
    [[CBTracker sharedTracker] setupTrackerWithAccountId:uid
                                                  domain:domain];
}

RCT_EXPORT_METHOD(stopTracker) {
    [[CBTracker sharedTracker] stopTracker];
}

RCT_EXPORT_METHOD(setAuthors:(NSArray *)authors) {
    [[CBTracker sharedTracker] setAuthors:authors];
}

RCT_EXPORT_METHOD(setSections:(NSArray *)sections) {
    [[CBTracker sharedTracker] setSections:sections];
}

RCT_EXPORT_METHOD(trackView:(id)view viewId:(NSString *)viewId title:(NSString *)title) {
    [[CBTracker sharedTracker] trackView:view
                                  viewId:viewId
                                   title:title];
}

@end
  
