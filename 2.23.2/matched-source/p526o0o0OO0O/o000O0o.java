package p526o0o0OO0O;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentModelKt;
import com.yalla.yalla.model.share.ShareContentType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O00OOO;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShareThirdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1855#2,2:154\n1855#2,2:156\n1855#2,2:158\n1855#2,2:160\n1855#2,2:162\n*S KotlinDebug\n*F\n+ 1 ShareThirdDialog.kt\ncom/yalla/yalla/ui/dialog/shareThird/ShareThirdDialog\n*L\n53#1:154,2\n96#1:156,2\n99#1:158,2\n141#1:160,2\n147#1:162,2\n*E\n"})
public final class o000O0o extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f53318OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ShareContentType f53319OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f53320OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f53321OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f53322OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f53323OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ShareContentModel f53324OooOOo0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            try {
                iArr[ShareChannel.Friends.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareChannel.Moments.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareChannel.Facebook.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareChannel.Twitter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareChannel.Instagram.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0O00OOO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00OOO invoke() {
            o000O0o o000o0o2 = o000O0o.this;
            o0O00OOO o0o00oooInflate = o0O00OOO.inflate(LayoutInflater.from(o000o0o2.f53318OooOO0O), o000o0o2.f58508OooO0o, true);
            Intrinsics.checkNotNullExpressionValue(o0o00oooInflate, "inflate(...)");
            return o0o00oooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull FragmentActivity activity, @NotNull ShareContentType shareContentType) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareContentType, "shareContentType");
        this.f53318OooOO0O = activity;
        this.f53319OooOO0o = shareContentType;
        this.f53321OooOOO0 = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        this.f53320OooOOO = arrayList;
        this.f53322OooOOOO = new o000Oo0(activity);
        this.f53323OooOOOo = true;
        LinearLayout linearLayout = OooOO0().f44457OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
        TextView friends = OooOO0().f44459OooO0OO;
        Intrinsics.checkNotNullExpressionValue(friends, "friends");
        arrayList.add(friends);
        TextView moments = OooOO0().f44461OooO0o;
        Intrinsics.checkNotNullExpressionValue(moments, "moments");
        arrayList.add(moments);
        TextView facebook = OooOO0().f44458OooO0O0;
        Intrinsics.checkNotNullExpressionValue(facebook, "facebook");
        arrayList.add(facebook);
        TextView twitter = OooOO0().f44464OooO0oo;
        Intrinsics.checkNotNullExpressionValue(twitter, "twitter");
        arrayList.add(twitter);
        TextView instagram = OooOO0().f44460OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(instagram, "instagram");
        arrayList.add(instagram);
        TextView whatsApp = OooOO0().f44456OooO;
        Intrinsics.checkNotNullExpressionValue(whatsApp, "whatsApp");
        arrayList.add(whatsApp);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new View.OnClickListener() { // from class: o0o0OO0O.o000O000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareChannel shareChannel;
                    o000O0o this$0 = this.f53305OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (Intrinsics.areEqual(view, this$0.OooOO0().f44459OooO0OO)) {
                        shareChannel = ShareChannel.Friends;
                    } else if (Intrinsics.areEqual(view, this$0.OooOO0().f44461OooO0o)) {
                        shareChannel = ShareChannel.Moments;
                    } else if (Intrinsics.areEqual(view, this$0.OooOO0().f44458OooO0O0)) {
                        shareChannel = ShareChannel.Facebook;
                    } else if (Intrinsics.areEqual(view, this$0.OooOO0().f44464OooO0oo)) {
                        shareChannel = ShareChannel.Twitter;
                    } else if (Intrinsics.areEqual(view, this$0.OooOO0().f44460OooO0Oo)) {
                        shareChannel = ShareChannel.Instagram;
                    } else {
                        shareChannel = Intrinsics.areEqual(view, this$0.OooOO0().f44456OooO) ? ShareChannel.WhatsApp : null;
                    }
                    o000Oo0 o000oo1 = this$0.f53322OooOOOO;
                    o000oo1.getClass();
                    if (shareChannel != null) {
                        switch (o000Oo0.OooO0O0.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                            case 1:
                                o0000oo o0000ooVar = o000oo1.f53341OooO0oO;
                                if (o0000ooVar != null) {
                                    o0000ooVar.OooO00o(o000oo1.f53335OooO00o);
                                }
                                break;
                            case 2:
                                o000 o000Var = o000oo1.f53339OooO0o;
                                if (o000Var != null) {
                                    o000Var.OooO00o(o000oo1.f53335OooO00o);
                                }
                                break;
                            case 3:
                                o0000Ooo o0000ooo = o000oo1.f53336OooO0O0;
                                if (o0000ooo != null) {
                                    o0000ooo.OooO00o(o000oo1.f53335OooO00o);
                                }
                                break;
                            case 4:
                                o000O00O o000o00o2 = o000oo1.f53337OooO0OO;
                                if (o000o00o2 != null) {
                                    o000o00o2.OooO00o(o000oo1.f53335OooO00o);
                                }
                                break;
                            case 5:
                                o0000O0 o0000o1 = o000oo1.f53340OooO0o0;
                                if (o0000o1 != null) {
                                    o0000o1.OooO0O0(o000oo1.f53335OooO00o);
                                }
                                break;
                            case 6:
                                o000OO0O o000oo0o2 = o000oo1.f53338OooO0Oo;
                                if (o000oo0o2 != null) {
                                    o000oo0o2.OooO00o(o000oo1.f53335OooO00o);
                                }
                                break;
                        }
                    }
                    this$0.OooO0O0();
                }
            });
        }
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        this.f53322OooOOOO.f53335OooO00o = this.f53324OooOOo0;
        ArrayList arrayList = this.f53320OooOOO;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o000O.OooO0O0((TextView) it.next());
        }
        ShareContentType shareContentType = this.f53319OooOO0o;
        boolean z = this.f53323OooOOOo;
        Iterator<T> it2 = ShareContentModelKt.getShareChannels(shareContentType, z).iterator();
        while (it2.hasNext()) {
            switch (OooO00o.$EnumSwitchMapping$0[((ShareChannel) it2.next()).ordinal()]) {
                case 1:
                    TextView friends = OooOO0().f44459OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(friends, "friends");
                    o000O.OooOOOO(friends);
                    break;
                case 2:
                    TextView moments = OooOO0().f44461OooO0o;
                    Intrinsics.checkNotNullExpressionValue(moments, "moments");
                    o000O.OooOOOO(moments);
                    break;
                case 3:
                    TextView facebook = OooOO0().f44458OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(facebook, "facebook");
                    o000O.OooOOOO(facebook);
                    break;
                case 4:
                    TextView twitter = OooOO0().f44464OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(twitter, "twitter");
                    o000O.OooOOOO(twitter);
                    break;
                case 5:
                    TextView instagram = OooOO0().f44460OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(instagram, "instagram");
                    o000O.OooOOOO(instagram);
                    break;
                case 6:
                    TextView whatsApp = OooOO0().f44456OooO;
                    Intrinsics.checkNotNullExpressionValue(whatsApp, "whatsApp");
                    o000O.OooOOOO(whatsApp);
                    break;
            }
        }
        if (z) {
            TextView friends2 = OooOO0().f44459OooO0OO;
            Intrinsics.checkNotNullExpressionValue(friends2, "friends");
            o000O.OooOOOO(friends2);
        } else {
            TextView friends3 = OooOO0().f44459OooO0OO;
            Intrinsics.checkNotNullExpressionValue(friends3, "friends");
            o000O.OooO0O0(friends3);
        }
        OooOO0().f44462OooO0o0.setBackgroundResource(o0Oo0oo.shape_dialog_bg_white);
        OooOO0().f44463OooO0oO.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((TextView) it3.next()).setTextColor(o0000.OooO00o(o0OOO0o.color_5f5f5f));
        }
    }

    public final o0O00OOO OooOO0() {
        return (o0O00OOO) this.f53321OooOOO0.getValue();
    }
}
