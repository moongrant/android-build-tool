package com.yalla.yalla.ui.screen.moment.media;

import android.content.Intent;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p526o0o0OOO0.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVideoFeedScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,880:1\n1855#2,2:881\n*S KotlinDebug\n*F\n+ 1 VideoFeedScreen.kt\ncom/yalla/yalla/ui/screen/moment/media/VideoFeedScreen$InitObservers$4$callback$1\n*L\n854#1:881,2\n*E\n"})
public final class OooOO0 implements o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f29425OooO00o;

    public OooOO0(MomentVideoVM momentVideoVM) {
        this.f29425OooO00o = momentVideoVM;
    }

    @Override // p526o0o0OOO0.o000OO00
    public final void OooO00o(int i, int i2, @Nullable Intent intent) {
        if (i != 1022 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("userid");
        boolean booleanExtra = intent.getBooleanExtra("follow", true);
        MomentVideoVM momentVideoVM = this.f29425OooO00o;
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            if (stringExtra != null) {
                MomentDetailModel momentDetailModel = null;
                for (MomentDetailModel momentDetailModel2 : momentVideoVM.getListData()) {
                    if (momentDetailModel2.getUserId() == Long.parseLong(stringExtra) && booleanExtra != momentDetailModel2.isFollow()) {
                        momentDetailModel2.setFollow(booleanExtra);
                        momentDetailModel = momentDetailModel2;
                    }
                }
                if (momentDetailModel != null) {
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART").post(momentDetailModel);
                    unit = Unit.INSTANCE;
                }
            }
            Result.m4213constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
    }
}
