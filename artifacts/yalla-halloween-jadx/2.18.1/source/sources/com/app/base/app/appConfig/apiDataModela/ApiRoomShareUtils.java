package com.app.base.app.appConfig.apiDataModela;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.ShareUrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\rJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR.\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/ApiRoomShareUtils;", "", "()V", "hasGetWepApi", "", "isRun", "Ljava/util/concurrent/atomic/AtomicBoolean;", "localShareUrlList", "", "getLocalShareUrlList", "()Lkotlin/Unit;", "mapModel", "Ljava/util/HashMap;", "", "Lcom/app/base/model/ShareUrlModel;", "Lkotlin/collections/HashMap;", "shareUrlModelLoad", "getShareUrlModelLoad", "()Lcom/app/base/model/ShareUrlModel;", "webApiRoomShareUrlList", "getWebApiRoomShareUrlList", "clean", "getModelForKey", "key", "getShareUrlModel", "getWebApi", "init", "toShareMapForResponse", "response", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApiRoomShareUtils {
    public static final int $stable;

    @NotNull
    public static final ApiRoomShareUtils INSTANCE;
    private static boolean hasGetWepApi;

    @NotNull
    private static final AtomicBoolean isRun;

    @Nullable
    private static HashMap<Integer, ShareUrlModel> mapModel;

    static {
        ApiRoomShareUtils apiRoomShareUtils = new ApiRoomShareUtils();
        INSTANCE = apiRoomShareUtils;
        isRun = new AtomicBoolean();
        apiRoomShareUtils.init(false);
        $stable = 8;
    }

    private ApiRoomShareUtils() {
    }

    private final Unit getLocalShareUrlList() {
        String strOooO0OO = o00000O.OooO0O0().OooO0OO("ROOM_SHARE_URL_LIST");
        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "getTableXJ().roomShareUrlList");
        toShareMapForResponse(strOooO0OO);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private final ShareUrlModel getShareUrlModel(int key, boolean getWebApi) {
        HashMap<Integer, ShareUrlModel> map = mapModel;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            if (map.isEmpty()) {
                init(getWebApi);
            } else {
                HashMap<Integer, ShareUrlModel> map2 = mapModel;
                Intrinsics.checkNotNull(map2);
                if (!map2.containsKey(Integer.valueOf(key))) {
                    init(getWebApi);
                }
            }
        } else {
            init(getWebApi);
        }
        return getModelForKey(key);
    }

    private final Unit getWebApiRoomShareUrlList() {
        synchronized (ApiRoomShareUtils.class) {
            if (isRun.get()) {
                return Unit.INSTANCE;
            }
            o0000O0.OooO0O0(GlobalScope.INSTANCE, new ApiRoomShareUtils$webApiRoomShareUrlList$1$1(null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toShareMapForResponse(String response) {
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(response, new o00000O0<AbsJavaBeanApi<List<? extends ShareUrlModel>>>() { // from class: com.app.base.app.appConfig.apiDataModela.ApiRoomShareUtils$toShareMapForResponse$result$1
        }.getType());
        if ((absJavaBeanApi != null ? (List) absJavaBeanApi.getData() : null) != null) {
            List<ShareUrlModel> arrayList = (List) absJavaBeanApi.getData();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (mapModel == null) {
                mapModel = new HashMap<>();
            }
            HashMap<Integer, ShareUrlModel> map = mapModel;
            Intrinsics.checkNotNull(map);
            map.clear();
            for (ShareUrlModel shareUrlModel : arrayList) {
                HashMap<Integer, ShareUrlModel> map2 = mapModel;
                Intrinsics.checkNotNull(map2);
                Integer shareKey = shareUrlModel.getShareKey();
                Intrinsics.checkNotNullExpressionValue(shareKey, "item.shareKey");
                map2.put(shareKey, shareUrlModel);
            }
        }
    }

    public final void clean() {
        HashMap<Integer, ShareUrlModel> map = mapModel;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            map.clear();
        }
        mapModel = null;
    }

    @Nullable
    public final ShareUrlModel getModelForKey(int key) {
        HashMap<Integer, ShareUrlModel> map = mapModel;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            if (!map.isEmpty()) {
                HashMap<Integer, ShareUrlModel> map2 = mapModel;
                Intrinsics.checkNotNull(map2);
                if (map2.containsKey(Integer.valueOf(key))) {
                    HashMap<Integer, ShareUrlModel> map3 = mapModel;
                    Intrinsics.checkNotNull(map3);
                    return map3.get(Integer.valueOf(key));
                }
            }
        }
        return null;
    }

    @Nullable
    public final ShareUrlModel getShareUrlModelLoad() {
        return getShareUrlModel(oo000o.OooO0O0(), false);
    }

    public final void init(boolean getWebApi) {
        Boolean value = OooOOO.f41216OooO00o.OooOooO().getValue();
        Intrinsics.checkNotNull(value);
        if (value.booleanValue()) {
            if (getWebApi) {
                getWebApiRoomShareUrlList();
            } else if (hasGetWepApi) {
                getLocalShareUrlList();
            } else {
                getWebApiRoomShareUrlList();
            }
        }
    }
}
