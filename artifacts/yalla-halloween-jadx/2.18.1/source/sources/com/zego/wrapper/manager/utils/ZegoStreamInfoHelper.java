package com.zego.wrapper.manager.utils;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoStreamInfo{userID='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, zegoStreamInfo.userID, '\'', ", userName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, zegoStreamInfo.userName, '\'', ", streamID='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, zegoStreamInfo.streamID, '\'', ", extraInfo='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, zegoStreamInfo.extraInfo, '\'', '}');
    }
}
