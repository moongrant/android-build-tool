package com.yalla.yalla.module.event.ui.view;

import com.code.android.util.o000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0o0O.o000OO0O;
import p532o0o0OOOO.o0O0o000;
import p565o0oOo000.o000OOo;
import p675oO0Oo.oO0O000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function2<Integer, oO0O000<MenuDialogTag>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f23600OooO0Oo;

    /* JADX INFO: renamed from: com.yalla.yalla.module.event.ui.view.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0300OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuDialogTag.values().length];
            try {
                iArr[MenuDialogTag.dislike.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuDialogTag.report.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(EventModel eventModel) {
        super(2);
        this.f23600OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, oO0O000<MenuDialogTag> oo0o000) {
        num.intValue();
        oO0O000<MenuDialogTag> item = oo0o000;
        Intrinsics.checkNotNullParameter(item, "item");
        int i = C0300OooO00o.$EnumSwitchMapping$0[item.f59676OooO0Oo.ordinal()];
        EventModel eventModel = this.f23600OooO0Oo;
        if (i == 1) {
            o000OO0O.OooO0O0(eventModel.getId());
            o000O00.OooO00o(o000OOo.thanks_feedback);
            LiveEventBus.get("DISLIKE_EVENT").post(Long.valueOf(eventModel.getId()));
        } else if (i == 2) {
            o0O0o000.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(6, eventModel.getId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        }
        return null;
    }
}
