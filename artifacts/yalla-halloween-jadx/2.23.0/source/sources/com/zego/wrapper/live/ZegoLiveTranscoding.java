package com.zego.wrapper.live;

import androidx.compose.foundation.layout.OooO0O0;
import com.zego.wrapper.video.ZegoImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoLiveTranscoding {
    private static final int DEFAULT_AUDIO_BITRATE = 48;
    private static final int DEFAULT_AUDIO_CHANNELS = 1;
    private static final int DEFAULT_HEIGHT = 640;
    private static final int DEFAULT_VIDEO_BITRATE = 400;
    private static final int DEFAULT_VIDEO_FRAMERATE = 15;
    private static final int DEFAULT_WIDTH = 360;
    private static final int MAX_AUDIO_BITRATE = 128;
    private static final int MAX_AUDIO_CHANNELS = 2;
    private static final int MAX_VIDEO_BITRATE = 10000;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MIN_AUDIO_CHANNELS = 1;
    private static final int MIN_HEIGHT = 16;
    private static final int MIN_VIDEO_FRAMERATE = 15;
    private static final int MIN_WIDTH = 16;
    public int width = DEFAULT_WIDTH;
    public int height = DEFAULT_HEIGHT;
    public int videoBitrate = 400;
    public int videoFramerate = 15;
    public ZegoImage watermark = new ZegoImage();
    public ZegoImage backgroundImage = new ZegoImage();
    public int audioBitrate = 48;
    public int audioChannels = 1;
    private Map<Integer, TranscodingUser> transcodingUsers = new HashMap();
    public int backgroundColor = 0;

    public static class TranscodingUser {
        public int height;
        public int uid;
        public int width;
        public int x;
        public int y;
        public int zOrder;

        public boolean isValid() {
            int i = this.zOrder;
            return i >= 0 && i <= 100;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TranscodingUser{uid=");
            sb.append(this.uid);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", zOrder=");
            return OooO0O0.OooO00o(sb, this.zOrder, '}');
        }
    }

    public int addUser(TranscodingUser transcodingUser) {
        if (transcodingUser == null || !transcodingUser.isValid()) {
            return -2;
        }
        this.transcodingUsers.put(Integer.valueOf(transcodingUser.uid), transcodingUser);
        return 0;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getUserCount() {
        return this.transcodingUsers.size();
    }

    public final ArrayList<TranscodingUser> getUsers() {
        return new ArrayList<>(this.transcodingUsers.values());
    }

    public boolean isValid() {
        int i;
        int i2;
        return this.width >= 16 && this.height >= 16 && this.videoBitrate <= 10000 && (i = this.videoFramerate) >= 15 && i <= 30 && this.audioBitrate <= 128 && (i2 = this.audioChannels) >= 1 && i2 <= 2 && !this.transcodingUsers.isEmpty();
    }

    public int removeUser(int i) {
        if (!this.transcodingUsers.containsKey(Integer.valueOf(i))) {
            return -2;
        }
        this.transcodingUsers.remove(Integer.valueOf(i));
        return 0;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setUsers(ArrayList<TranscodingUser> arrayList) {
        this.transcodingUsers.clear();
        if (arrayList != null) {
            for (TranscodingUser transcodingUser : arrayList) {
                this.transcodingUsers.put(Integer.valueOf(transcodingUser.uid), transcodingUser);
            }
        }
    }

    public String toString() {
        return "ZegoLiveTranscoding{width=" + this.width + ", height=" + this.height + ", videoBitrate=" + this.videoBitrate + ", videoFramerate=" + this.videoFramerate + ", watermark=" + this.watermark + ", backgroundImage=" + this.backgroundImage + ", audioBitrate=" + this.audioBitrate + ", audioChannels=" + this.audioChannels + ", backgroundColor=" + this.backgroundColor + ", transcodingUsers=" + this.transcodingUsers + '}';
    }

    public void setBackgroundColor(int i, int i2, int i3) {
        this.backgroundColor = (i << 16) | (i2 << 8) | i3;
    }

    public void setUsers(Map<Integer, TranscodingUser> map) {
        this.transcodingUsers.clear();
        if (map != null) {
            this.transcodingUsers.putAll(map);
        }
    }
}
