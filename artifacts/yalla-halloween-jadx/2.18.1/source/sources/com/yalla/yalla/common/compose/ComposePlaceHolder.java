package com.yalla.yalla.common.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ComposePlaceHolder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposePlaceHolder f20570OooO00o = new ComposePlaceHolder();

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaceholderType.values().length];
            iArr[PlaceholderType.UserHeader.ordinal()] = 1;
            iArr[PlaceholderType.RoomHeader.ordinal()] = 2;
            iArr[PlaceholderType.Topic.ordinal()] = 3;
            iArr[PlaceholderType.Picture.ordinal()] = 4;
            iArr[PlaceholderType.Gift.ordinal()] = 5;
            iArr[PlaceholderType.Gif.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f20571Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o.C0072OooO00o f20573Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PlaceholderType f20574Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(coil.request.OooO00o.C0072OooO00o c0072OooO00o, PlaceholderType placeholderType, int i) {
            super(2);
            this.f20573Oooo0oO = c0072OooO00o;
            this.f20574Oooo0oo = placeholderType;
            this.f20571Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ComposePlaceHolder.this.OooO00o(this.f20573Oooo0oO, this.f20574Oooo0oo, ooo00o, this.f20571Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/common/compose/ComposePlaceHolder$PlaceholderType;", "", "UserHeader", "RoomHeader", "Topic", "Picture", "Gift", "Gif", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum PlaceholderType {
        UserHeader,
        RoomHeader,
        Topic,
        Picture,
        Gift,
        Gif
    }

    @Composable
    public final void OooO00o(@NotNull coil.request.OooO00o.C0072OooO00o c0072OooO00o, @NotNull PlaceholderType Type, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(c0072OooO00o, "<this>");
        Intrinsics.checkNotNullParameter(Type, "Type");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-569095270);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        switch (OooO00o.$EnumSwitchMapping$0[Type.ordinal()]) {
            case 1:
                c0072OooO00o.OooO0OO(R.drawable.icon_head_default);
                c0072OooO00o.OooO0Oo(R.drawable.icon_head_default);
                break;
            case 2:
                c0072OooO00o.OooO0OO(R.drawable.icon_head_default);
                c0072OooO00o.OooO0Oo(R.drawable.icon_head_default);
                break;
            case 3:
                c0072OooO00o.OooO0OO(R.drawable.icon_head_default);
                c0072OooO00o.OooO0Oo(R.drawable.icon_head_default);
                break;
            case 4:
                c0072OooO00o.OooO0OO(R.drawable.icon_picture_default);
                c0072OooO00o.OooO0Oo(R.drawable.icon_picture_default);
                break;
            case 5:
                c0072OooO00o.OooO0OO(R.drawable.icon_gift_default_gray);
                c0072OooO00o.OooO0Oo(R.drawable.icon_gift_default_gray);
                break;
            case 6:
                c0072OooO00o.OooO0OO(R.drawable.ic_gif_default);
                c0072OooO00o.OooO0Oo(R.drawable.ic_gif_default);
                break;
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(c0072OooO00o, Type, i));
    }
}
