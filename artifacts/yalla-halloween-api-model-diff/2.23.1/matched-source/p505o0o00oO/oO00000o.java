package p505o0o00oO;

import android.util.SparseArray;
import android.view.View;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p543o0o0OoO0.o00OOOOo;
import p543o0o0OoO0.o0O000;
import p543o0o0OoO0.o0O0000O;
import p543o0o0OoO0.o0O000O;
import p543o0o0OoO0.o0O000Oo;
import p543o0o0OoO0.o0O00o0;
import p543o0o0OoO0.o0OoO00O;
import p543o0o0OoO0.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00000o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50495OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f50496OooO0o0;

    public /* synthetic */ oO00000o(int i, View.OnClickListener onClickListener) {
        this.f50495OooO0Oo = i;
        this.f50496OooO0o0 = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShareChannel shareChannel;
        int i = this.f50495OooO0Oo;
        View.OnClickListener onClickListener = this.f50496OooO0o0;
        switch (i) {
            case 0:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) onClickListener;
                int i2 = UserInfoTagActivity.f26869Oooo0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SparseArray<TagListModel.TagInfo> sparseArray = this$0.f26881OooOooO;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                TagListModel.TagInfo tagInfo = sparseArray.get(((Integer) tag).intValue());
                ArrayList<TagListModel.TagInfo> arrayList = this$0.f26880OooOoo0;
                Intrinsics.checkNotNull(arrayList);
                TypeIntrinsics.asMutableCollection(arrayList).remove(this$0.OooOoo(tagInfo.tagId));
                this$0.OooOoo0().f43714OooO0O0.removeView(view);
                TagListModel tagListModel = this$0.f26874OooOo0O;
                Intrinsics.checkNotNull(tagListModel);
                int size = tagListModel.data.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TagListModel tagListModel2 = this$0.f26874OooOo0O;
                    Intrinsics.checkNotNull(tagListModel2);
                    if (tagListModel2.data.get(i3).tagId == tagInfo.typeId) {
                        this$0.OooOoOO().notifyItemChanged(i3);
                        if (this$0.f26871OooOo == i3) {
                            this$0.OooOoOO().notifyItemChanged(this$0.f26877OooOoO0);
                        }
                    }
                }
                ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f26880OooOoo0;
                Intrinsics.checkNotNull(arrayList2);
                if (arrayList2.size() == 0) {
                    this$0.OooOoo0().f43718OooO0o0.setVisibility(0);
                    this$0.OooOoo0().f43714OooO0O0.setVisibility(8);
                }
                this$0.OooOooo();
                this$0.Oooo00O();
                break;
            default:
                o0O000 this$1 = (o0O000) onClickListener;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (Intrinsics.areEqual(view, this$1.OooOO0().f44680OooO0OO)) {
                    shareChannel = ShareChannel.Friends;
                } else if (Intrinsics.areEqual(view, this$1.OooOO0().f44682OooO0o)) {
                    shareChannel = ShareChannel.Moments;
                } else if (Intrinsics.areEqual(view, this$1.OooOO0().f44679OooO0O0)) {
                    shareChannel = ShareChannel.Facebook;
                } else if (Intrinsics.areEqual(view, this$1.OooOO0().f44685OooO0oo)) {
                    shareChannel = ShareChannel.Twitter;
                } else if (Intrinsics.areEqual(view, this$1.OooOO0().f44681OooO0Oo)) {
                    shareChannel = ShareChannel.Instagram;
                } else {
                    shareChannel = Intrinsics.areEqual(view, this$1.OooOO0().f44677OooO) ? ShareChannel.WhatsApp : null;
                }
                o0O000O o0o000o = this$1.f54866OooOOOO;
                o0o000o.getClass();
                if (shareChannel != null) {
                    switch (o0O000O.OooO0O0.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                        case 1:
                            o0O00o0 o0o00o1 = o0o000o.f54881OooO0oO;
                            if (o0o00o1 != null) {
                                o0o00o1.OooO00o(o0o000o.f54875OooO00o);
                            }
                            break;
                        case 2:
                            o0O0000O o0o0000o2 = o0o000o.f54879OooO0o;
                            if (o0o0000o2 != null) {
                                o0o0000o2.OooO00o(o0o000o.f54875OooO00o);
                            }
                            break;
                        case 3:
                            o00OOOOo o00ooooo2 = o0o000o.f54876OooO0O0;
                            if (o00ooooo2 != null) {
                                o00ooooo2.OooO00o(o0o000o.f54875OooO00o);
                            }
                            break;
                        case 4:
                            o0O000Oo o0o000oo2 = o0o000o.f54877OooO0OO;
                            if (o0o000oo2 != null) {
                                o0o000oo2.OooO00o(o0o000o.f54875OooO00o);
                            }
                            break;
                        case 5:
                            oo00oO oo00oo = o0o000o.f54880OooO0o0;
                            if (oo00oo != null) {
                                oo00oo.OooO0O0(o0o000o.f54875OooO00o);
                            }
                            break;
                        case 6:
                            o0OoO00O o0ooo00o2 = o0o000o.f54878OooO0Oo;
                            if (o0ooo00o2 != null) {
                                o0ooo00o2.OooO00o(o0o000o.f54875OooO00o);
                            }
                            break;
                    }
                }
                this$1.OooO0O0();
                break;
        }
    }
}
