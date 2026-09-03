package p538o0o0Oo0;

import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;
import p542o0o0OoO.o00OOO0O;
import p542o0o0OoO.o00Oo00;
import p542o0o0OoO.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43958Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(0);
        this.f43958Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00Oo00 o00oo00 = this.f43958Oooo0o.f22483Ooooooo;
        Intrinsics.checkNotNull(o00oo00);
        PostCommentDetailModel postCommentDetailModel = this.f43958Oooo0o.f22476Ooooo0o;
        Objects.requireNonNull(o00oo00);
        if (postCommentDetailModel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        MoreTag moreTag = MoreTag.reply;
        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag.getText()), moreTag));
        MoreTag moreTag2 = MoreTag.copy;
        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag2.getText()), moreTag2));
        if (postCommentDetailModel.isDel()) {
            MoreTag moreTag3 = MoreTag.delete;
            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag3.getText()), moreTag3));
        } else {
            MoreTag moreTag4 = MoreTag.report;
            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag4.getText()), moreTag4));
        }
        o00O0 o00o1 = new o00O0(o00oo00.f44186OooO00o);
        o00o1.OooOOo0(arrayList);
        o00o1.OooOOoo(new o00OOO0O(postCommentDetailModel, o00oo00));
        o00o1.OooOO0(o0o0Oo.f44195Oooo0o);
        o00o1.OooOOO0();
        return null;
    }
}
