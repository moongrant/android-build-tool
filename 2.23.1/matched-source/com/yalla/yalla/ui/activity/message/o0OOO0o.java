package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25529OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreTag.values().length];
            try {
                iArr[MoreTag.delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(FriendRequestMessageActivity friendRequestMessageActivity, long j) {
        super(2);
        this.f25528OooO0Oo = friendRequestMessageActivity;
        this.f25529OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        if (OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()] == 1) {
            int i = FriendRequestMessageActivity.f25196OooOo0o;
            this.f25528OooO0Oo.OooOoO().deleteMessage(this.f25529OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
