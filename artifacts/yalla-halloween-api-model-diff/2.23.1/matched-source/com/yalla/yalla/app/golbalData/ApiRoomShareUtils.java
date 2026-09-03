package com.yalla.yalla.app.golbalData;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.share.ShareUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270o00oooo0.o0O0OO0;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oO00Oo0;
import p596o0oo000O.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class ApiRoomShareUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ApiRoomShareUtils f22248OooO00o = new ApiRoomShareUtils();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f22249OooO0O0 = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static HashMap<Integer, ShareUrlModel> f22250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f22251OooO0Oo;

    static {
        OooO0OO(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @Nullable
    public static ShareUrlModel OooO00o() {
        int iOooO0OO = OooO0o.OooO0OO();
        HashMap<Integer, ShareUrlModel> map = f22250OooO0OO;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            if (map.isEmpty()) {
                OooO0OO(false);
            } else {
                HashMap<Integer, ShareUrlModel> map2 = f22250OooO0OO;
                Intrinsics.checkNotNull(map2);
                if (!map2.containsKey(Integer.valueOf(iOooO0OO))) {
                    OooO0OO(false);
                }
            }
        } else {
            OooO0OO(false);
        }
        HashMap<Integer, ShareUrlModel> map3 = f22250OooO0OO;
        if (map3 != null) {
            Intrinsics.checkNotNull(map3);
            if (!map3.isEmpty()) {
                HashMap<Integer, ShareUrlModel> map4 = f22250OooO0OO;
                Intrinsics.checkNotNull(map4);
                if (map4.containsKey(Integer.valueOf(iOooO0OO))) {
                    HashMap<Integer, ShareUrlModel> map5 = f22250OooO0OO;
                    Intrinsics.checkNotNull(map5);
                    return map5.get(Integer.valueOf(iOooO0OO));
                }
            }
        }
        return null;
    }

    public static void OooO0O0() {
        synchronized (ApiRoomShareUtils.class) {
            if (f22249OooO0O0.get()) {
                Unit unit = Unit.INSTANCE;
            } else {
                OooOOO.OooO0OO(GlobalScope.INSTANCE, new ApiRoomShareUtils$webApiRoomShareUrlList$1$1(null));
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0OO(boolean z) {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        T value = oo0oO0.OooOo0O().getValue();
        Intrinsics.checkNotNull(value);
        if (((Boolean) value).booleanValue()) {
            if (z) {
                OooO0O0();
                return;
            }
            if (!f22251OooO0Oo) {
                OooO0O0();
                return;
            }
            String strOooO00o = o0O0OO0.OooO0O0().OooO00o("ROOM_SHARE_URL_LIST");
            Intrinsics.checkNotNullExpressionValue(strOooO00o, "getRoomShareUrlList(...)");
            OooO0Oo(strOooO00o);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void OooO0Oo(String str) {
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oO00Oo0.OooO0O0(str, new TypeToken<AbsJavaBeanApi<List<? extends ShareUrlModel>>>() { // from class: com.yalla.yalla.app.golbalData.ApiRoomShareUtils$toShareMapForResponse$result$1
        }.getType());
        if ((absJavaBeanApi != null ? (List) absJavaBeanApi.getData() : null) != null) {
            List<ShareUrlModel> arrayList = (List) absJavaBeanApi.getData();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (f22250OooO0OO == null) {
                f22250OooO0OO = new HashMap<>();
            }
            HashMap<Integer, ShareUrlModel> map = f22250OooO0OO;
            Intrinsics.checkNotNull(map);
            map.clear();
            for (ShareUrlModel shareUrlModel : arrayList) {
                HashMap<Integer, ShareUrlModel> map2 = f22250OooO0OO;
                Intrinsics.checkNotNull(map2);
                Integer shareKey = shareUrlModel.getShareKey();
                Intrinsics.checkNotNullExpressionValue(shareKey, "getShareKey(...)");
                map2.put(shareKey, shareUrlModel);
            }
        }
    }
}
