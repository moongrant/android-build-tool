package com.facebook.appevents.codeless;

import android.os.Bundle;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p407o0Oo0OOO.oO00O0oO;
import p488o0o000oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13655OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f13656OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13657OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f13655OooO0Oo = i;
        this.f13657OooO0o0 = obj;
        this.f13656OooO0o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13655OooO0Oo;
        Object obj = this.f13656OooO0o;
        Object obj2 = this.f13657OooO0o0;
        switch (i) {
            case 0:
                CodelessLoggingEventListener.m4080logEvent$lambda0((String) obj2, (Bundle) obj);
                break;
            default:
                MainRoomPopularFragment this$0 = (MainRoomPopularFragment) obj2;
                CommonParseMultiListModel result = (CommonParseMultiListModel) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "$result");
                if (!this$0.isFirstApiStatistical) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    o0000O00.OooO00o oooO00oOooO0O0 = o0000O00.OooO0O0(((oO00O0oO) this$0.getBinding()).f44792OooO0OO);
                    int i2 = oooO00oOooO0O0.f48722OooO00o;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int size = result.data.size();
                    int i3 = oooO00oOooO0O0.f48724OooO0OO;
                    if (i3 < size) {
                        while (i2 < i3) {
                            if (result.data.size() > i2) {
                                arrayList.add(((RoomIndexModel) result.data.get(i2)).barid);
                                arrayList2.add(((RoomIndexModel) result.data.get(i2)).sessionId);
                            }
                            i2++;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this$0.isFirstApiStatistical = true;
                        WebEventRepository webEventRepository = WebEventRepository.f24438OooO00o;
                        EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_Popular;
                        webEventRepository.getClass();
                        WebEventRepository.OooO0oO(this$0, arrayList, arrayList2, enterRoomParentPage);
                        break;
                    }
                }
                break;
        }
    }
}
