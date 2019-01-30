package de.appplant.cordova.plugin.background;

import android.content.Context;
import android.util.Log;

import com.meizu.upspushsdklib.UpsCommandMessage;
import com.meizu.upspushsdklib.UpsPushMessage;
import com.meizu.upspushsdklib.UpsPushMessageReceiver;

/**
 * Author：loi on 2019-01-29 11:57
 * Emil：894900183@qq.com
 * - -
 */
public class MeiZuUpsReceiver extends UpsPushMessageReceiver {
    @Override
    public void onThroughMessage(Context context, UpsPushMessage upsPushMessage) {
        Log.e("MeiZuUpsReceiver", "魅族【onThroughMessage】" + upsPushMessage);
    }
    @Override
    public void onNotificationClicked(Context context, UpsPushMessage
            upsPushMessage) {
        Log.e("MeiZuUpsReceiver", "【onNotificationClicked】" + upsPushMessage);
    }
    @Override
    public void onNotificationArrived(Context context, UpsPushMessage
            upsPushMessage) {
        Log.e("MeiZuUpsReceiver", "【onNotificationArrived】" + upsPushMessage);
    }
    @Override
    public void onNotificationDeleted(Context context, UpsPushMessage
            upsPushMessage) {
        Log.e("MeiZuUpsReceiver", "【onNotificationDeleted】" + upsPushMessage);
    }

    @Override
    public void onUpsCommandResult(Context context, UpsCommandMessage upsCommandMessage) {
        Log.e("MeiZuUpsReceiver", "【onUpsCommandResult】" + upsCommandMessage);
    }
}
