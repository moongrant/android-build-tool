package com.common.support.atd.detectors.virtualapk;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.common.support.atd.YS;
import com.common.support.atd.base.InitResult;
import com.common.support.atd.network.BaseServerResponse;
import com.common.support.atd.network.PackageRespModel;
import com.common.support.atd.network.VirtualApkApi;
import com.common.support.atd.utils.JsonUtilKt;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/PackageDataManager;", "", "()V", "defaultPkgList", "", "", "lock", "totalPkgList", "", "getPackageList", "handleRespData", "", "context", "Landroid/content/Context;", "respModel", "Lcom/common/support/atd/network/PackageRespModel;", "init", "initResult", "Lcom/common/support/atd/base/InitResult;", "parsePkgList", "Lcom/common/support/atd/network/PackageRespModel$PackageModel;", "encryptedJsonStr", "requestServerData", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PackageDataManager {
    private static List<String> defaultPkgList;

    @NotNull
    public static final PackageDataManager INSTANCE = new PackageDataManager();

    @NotNull
    private static final List<String> totalPkgList = new ArrayList();

    @NotNull
    private static final Object lock = new Object();

    private PackageDataManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void handleRespData(Context context, PackageRespModel respModel) {
        List<PackageRespModel.PackageModel> pkgList;
        List<PackageRespModel.PackageModel> pkgList2;
        String latestVersionHex = respModel.getLatestVersionHex();
        if (!(latestVersionHex.length() > 0)) {
            latestVersionHex = null;
        }
        if (latestVersionHex != null) {
            HashSPUtil.INSTANCE.putHashToLocal(context, latestVersionHex);
        }
        if ((!StringsKt.isBlank(respModel.getAddPackages())) && (pkgList2 = parsePkgList(respModel.getAddPackages())) != null) {
            PackageDBUtil.INSTANCE.insertPkgListToLocal(context, pkgList2);
        }
        if (!(!StringsKt.isBlank(respModel.getModifyPackages())) || (pkgList = parsePkgList(respModel.getModifyPackages())) == null) {
            return;
        }
        PackageDBUtil.INSTANCE.updatePkgListToLocal(context, pkgList);
    }

    private final List<PackageRespModel.PackageModel> parsePkgList(String encryptedJsonStr) {
        try {
            Object objOooO0Oo = JsonUtilKt.getGson().OooO0Oo(YS.D(encryptedJsonStr), new TypeToken<List<? extends PackageRespModel.PackageModel>>() { // from class: com.common.support.atd.detectors.virtualapk.PackageDataManager.parsePkgList.1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "gson.fromJson<List<Packa…Model>>() {}.type\n      )");
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objOooO0Oo) {
                String pkgName = ((PackageRespModel.PackageModel) obj).getPkgName();
                if (pkgName == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                if (StringsKt.trim((CharSequence) pkgName).toString().length() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (JsonSyntaxException | JsonParseException unused) {
            return null;
        }
    }

    @NotNull
    public final List<String> getPackageList() {
        List<String> list;
        synchronized (lock) {
            list = totalPkgList;
        }
        return list;
    }

    public final void init(@NotNull Context context, @NotNull InitResult initResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initResult, "initResult");
        List<String> listLoadDefaultPkgList = MapsCheck.INSTANCE.loadDefaultPkgList();
        if (listLoadDefaultPkgList == null) {
            initResult.setCode(initResult.getCode() | 4);
            listLoadDefaultPkgList = CollectionsKt.emptyList();
        }
        defaultPkgList = listLoadDefaultPkgList;
        List<String> localPkgList = PackageDBUtil.INSTANCE.readLocalPkgList(context, initResult);
        synchronized (lock) {
            List<String> list = totalPkgList;
            list.clear();
            list.addAll(localPkgList);
            List<String> list2 = defaultPkgList;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("defaultPkgList");
                list2 = null;
            }
            list.addAll(list2);
        }
    }

    public final void requestServerData(@NotNull final Context context, @NotNull final InitResult initResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initResult, "initResult");
        new VirtualApkApi().requestPackageList(HashSPUtil.INSTANCE.getLocalHash(context), new Function1<BaseServerResponse<PackageRespModel>, Unit>() { // from class: com.common.support.atd.detectors.virtualapk.PackageDataManager.requestServerData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseServerResponse<PackageRespModel> baseServerResponse) {
                invoke2(baseServerResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable BaseServerResponse<PackageRespModel> baseServerResponse) {
                if (baseServerResponse == null || !baseServerResponse.getSuccess()) {
                    InitResult initResult2 = initResult;
                    initResult2.setCode(initResult2.getCode() | 16);
                    if (baseServerResponse != null) {
                        String str = "{code:" + baseServerResponse.getCode() + ", message:" + baseServerResponse.getMessage();
                    }
                    initResult.getMessage();
                    return;
                }
                PackageRespModel data = baseServerResponse.getData();
                if (data != null) {
                    PackageDataManager.INSTANCE.handleRespData(context, data);
                }
                List list = null;
                List localPkgList$default = PackageDBUtil.readLocalPkgList$default(PackageDBUtil.INSTANCE, context, null, 2, null);
                if (!(!localPkgList$default.isEmpty())) {
                    localPkgList$default = null;
                }
                if (localPkgList$default != null) {
                    synchronized (PackageDataManager.lock) {
                        if (!PackageDataManager.totalPkgList.isEmpty()) {
                            PackageDataManager.totalPkgList.clear();
                        }
                        PackageDataManager.totalPkgList.addAll(localPkgList$default);
                        List list2 = PackageDataManager.totalPkgList;
                        List list3 = PackageDataManager.defaultPkgList;
                        if (list3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("defaultPkgList");
                        } else {
                            list = list3;
                        }
                        list2.addAll(list);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        });
    }
}
