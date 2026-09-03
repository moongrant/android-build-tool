package com.app.base.app.appConfig.apiDataModela;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.Response;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/FriendsVM;", "Lo00OO/OooO00o;", "", "loadFriendsData", "", "pageIndex", "", "time", "Lcom/app/base/app/appConfig/apiDataModela/FriendsRepository;", "friendsRepository", "Lcom/app/base/app/appConfig/apiDataModela/FriendsRepository;", "pageSize", "I", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FriendsVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final FriendsRepository friendsRepository = new FriendsRepository();
    private final int pageSize = 100;

    public final void loadFriendsData() {
        if (OooO0OO.OooO00o().OooOo0O().OooO00o(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue())).isEmpty()) {
            loadFriendsData(1, 0L);
        }
    }

    public final void loadFriendsData(int pageIndex, long time) {
        this.friendsRepository.loadFriendsData(pageIndex, time, this.pageSize, new Function1<Response<ArrayList<FriendsModel>>, Unit>() { // from class: com.app.base.app.appConfig.apiDataModela.FriendsVM.loadFriendsData.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Response<ArrayList<FriendsModel>> response) {
                invoke2(response);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Response<ArrayList<FriendsModel>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList<FriendsModel> data = it.getData();
                if (data != null) {
                    int i = 0;
                    for (Object obj : data) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        i = i2;
                    }
                }
            }
        });
    }
}
