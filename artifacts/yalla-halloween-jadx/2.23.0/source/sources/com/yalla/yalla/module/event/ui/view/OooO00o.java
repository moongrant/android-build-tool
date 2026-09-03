package com.yalla.yalla.module.event.ui.view;

import com.code.android.util.o000O00O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p406o0Oo0Ooo.oOO0Oo00;
import p519o0o0O0oO.oOo00OO0;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function2<Integer, oOo00OO0<MenuDialogTag>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f24054OooO0Oo;

    /* JADX INFO: renamed from: com.yalla.yalla.module.event.ui.view.OooO00o$OooO00o, reason: collision with other inner class name */
    public /* synthetic */ class C0301OooO00o {
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
        this.f24054OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, oOo00OO0<MenuDialogTag> ooo00oo0) {
        num.intValue();
        oOo00OO0<MenuDialogTag> item = ooo00oo0;
        Intrinsics.checkNotNullParameter(item, "item");
        int i = C0301OooO00o.$EnumSwitchMapping$0[item.f53006OooO0Oo.ordinal()];
        EventModel eventModel = this.f24054OooO0Oo;
        if (i == 1) {
            oOO0Oo00.OooO0O0(eventModel.getId());
            o000O00O.OooO00o(oO00OOo0.thanks_feedback);
            LiveEventBus.get("DISLIKE_EVENT").post(Long.valueOf(eventModel.getId()));
        } else if (i == 2) {
            oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(6, eventModel.getId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
        }
        return null;
    }
}
