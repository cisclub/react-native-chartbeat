#import "Chartbeat.h"
#import "CBTracker.h"

@implementation Chartbeat

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(setupTrackerWithAccountId:(int)uid domain:(NSString *)domain) {
    [[CBTracker sharedTracker] setupTrackerWithAccountId:uid
                                                  domain:domain];
    [[CBTracker sharedTracker] setSubDomain:domain];
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

RCT_EXPORT_METHOD(trackViewWithId:(NSString *)viewId title:(NSString *)title) {
    UIView *rootView = [UIApplication sharedApplication].keyWindow.rootViewController.view;
    [[CBTracker sharedTracker] trackView:rootView
                                  viewId:viewId
                                   title:title];
}

@end
