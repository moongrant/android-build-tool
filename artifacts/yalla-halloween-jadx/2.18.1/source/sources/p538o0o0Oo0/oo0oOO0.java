package p538o0o0Oo0;

import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;
import p498o0o00Oo0.OooOOO;
import p542o0o0OoO.o00OOOO0;
import p542o0o0OoO.o00OOOOo;
import p542o0o0OoO.o00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f44110Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PostCommentSonModel f44111Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(PostDetailCommentSonListActivity postDetailCommentSonListActivity, PostCommentSonModel postCommentSonModel) {
        super(0);
        this.f44110Oooo0o = postDetailCommentSonListActivity;
        this.f44111Oooo0oO = postCommentSonModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00Oo00 o00oo00 = this.f44110Oooo0o.f22483Ooooooo;
        Intrinsics.checkNotNull(o00oo00);
        PostCommentSonModel postCommentSonModel = this.f44111Oooo0oO;
        Objects.requireNonNull(o00oo00);
        if (postCommentSonModel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        MoreTag moreTag = MoreTag.reply;
        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag.getText()), moreTag));
        MoreTag moreTag2 = MoreTag.copy;
        arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag2.getText()), moreTag2));
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        long userid = postCommentSonModel.getUserid();
        if (value != null && value.longValue() == userid) {
            MoreTag moreTag3 = MoreTag.report;
            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag3.getText()), moreTag3));
        }
        if (postCommentSonModel.isDel()) {
            MoreTag moreTag4 = MoreTag.delete;
            arrayList.add(new MoreModel(o000O0O0.OooO0OO(moreTag4.getText()), moreTag4));
        }
        o00O0 o00o1 = new o00O0(o00oo00.f44186OooO00o);
        o00o1.OooOOo0(arrayList);
        o00o1.OooOOoo(new o00OOOO0(postCommentSonModel, o00oo00));
        o00o1.OooOO0(o00OOOOo.f44185Oooo0o);
        o00o1.OooOOO0();
        return null;
    }
}
