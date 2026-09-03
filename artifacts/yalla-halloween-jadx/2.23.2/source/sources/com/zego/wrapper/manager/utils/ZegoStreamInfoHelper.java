package com.zego.wrapper.manager.utils;

import androidx.annotation.NonNull;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public final class ZegoStreamInfoHelper {
    public static boolean addAllStreamToSet(@NonNull Set<ZegoStreamInfo> set, Collection<ZegoStreamInfo> collection) {
        Iterator<ZegoStreamInfo> it = collection.iterator();
        boolean zAddStreamToSet = false;
        while (it.hasNext()) {
            zAddStreamToSet |= addStreamToSet(set, it.next());
        }
        return zAddStreamToSet;
    }

    public static boolean addStreamToSet(@NonNull Set<ZegoStreamInfo> set, ZegoStreamInfo zegoStreamInfo) {
        if (isContainsStream(set, zegoStreamInfo)) {
            return false;
        }
        set.add(zegoStreamInfo);
        return true;
    }

    public static boolean isContainsStream(@NonNull Collection<ZegoStreamInfo> collection, ZegoStreamInfo zegoStreamInfo) {
        Iterator<ZegoStreamInfo> it = collection.iterator();
        while (it.hasNext()) {
            if (streamEquals(it.next(), zegoStreamInfo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeAllStreamFromCollection(@NonNull Collection<ZegoStreamInfo> collection, @NonNull Collection<ZegoStreamInfo> collection2) {
        Iterator<ZegoStreamInfo> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (isContainsStream(collection2, it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean removeStreamFromCollection(@NonNull Collection<ZegoStreamInfo> collection, ZegoStreamInfo zegoStreamInfo) {
        Iterator<ZegoStreamInfo> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (streamEquals(it.next(), zegoStreamInfo)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAllStreamFromCollection(@NonNull Collection<ZegoStreamInfo> collection, @NonNull Collection<ZegoStreamInfo> collection2) {
        Iterator<ZegoStreamInfo> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!isContainsStream(collection2, it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean streamEquals(ZegoStreamInfo zegoStreamInfo, Object obj) {
        return (obj instanceof ZegoStreamInfo) && zegoStreamInfo.streamID.equals(((ZegoStreamInfo) obj).streamID);
    }

    public static String streamToString(ZegoStreamInfo zegoStreamInfo) {
        StringBuilder sb = new StringBuilder("ZegoStreamInfo{userID='");
        sb.append(zegoStreamInfo.userID);
        sb.append("', userName='");
        sb.append(zegoStreamInfo.userName);
        sb.append("', streamID='");
        sb.append(zegoStreamInfo.streamID);
        sb.append("', extraInfo='");
        return o0oOO.OooO0O0(sb, zegoStreamInfo.extraInfo, "'}");
    }
}
