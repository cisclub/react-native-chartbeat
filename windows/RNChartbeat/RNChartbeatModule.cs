using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Chartbeat.RNChartbeat
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNChartbeatModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNChartbeatModule"/>.
        /// </summary>
        internal RNChartbeatModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNChartbeat";
            }
        }
    }
}
