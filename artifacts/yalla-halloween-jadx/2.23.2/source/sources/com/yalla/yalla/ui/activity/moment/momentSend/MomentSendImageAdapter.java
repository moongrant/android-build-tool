package com.yalla.yalla.ui.activity.moment.momentSend;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.common.support.imagepicker.album.TimeStringUtilKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.album.PreviewImageActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.ui.activity.moment.ExoPlayVideoActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p423o0OoO0OO.o00O00OO;
import p423o0OoO0OO.o00O0OO;
import p494o0o00OOo.o000000;
import p494o0o00OOo.o000OOo;
import p494o0o00OOo.o0O0O00;
import p494o0o00OOo.o0OOO0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p591o0oOoooO.b3;
import p596o0oo00O0.o00000;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImageAdapter.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1864#2,3:210\n*S KotlinDebug\n*F\n+ 1 MomentSendImageAdapter.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter\n*L\n193#1:210,3\n*E\n"})
public final class MomentSendImageAdapter extends o0000oo<MomentSelectMedia> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f25971OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f25972OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f25973OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f25974OooOooo;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter$MomentSendMediaType[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter$MomentSendMediaType[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter$MomentSendMediaType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImageAdapter$MomentSendMediaType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "Add", "Image", "Video", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class MomentSendMediaType {
        Add(0),
        Image(1),
        Video(2);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(momentSendMediaTypeArr);
        }

        public MomentSendMediaType(int i) {
            super(str, i);
            this.value = i;
        }

        public static MomentSendMediaType valueOf(String str) {
            return (MomentSendMediaType) Enum.valueOf(MomentSendMediaType.class, str);
        }

        public static MomentSendMediaType[] values() {
            return (MomentSendMediaType[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MomentSendImageAdapter(@NotNull MomentSendActivity activity, @NotNull ArrayList data) {
        super(activity, data);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f25972OooOoo0 = activity;
        OooO00o oooO00o = new OooO00o();
        this.f13192OooOo0O = oooO00o;
        oooO00o.OooO0O0(MomentSendMediaType.Add.getValue(), oo0o0Oo.item_moment_send_add);
        oooO00o.OooO0O0(MomentSendMediaType.Image.getValue(), oo0o0Oo.item_moment_send_image);
        oooO00o.OooO0O0(MomentSendMediaType.Video.getValue(), oo0o0Oo.item_moment_send_video);
    }

    public static final void Oooo0o0(MomentSendImageAdapter momentSendImageAdapter, int i) {
        momentSendImageAdapter.getClass();
        ArrayList imagePathList = new ArrayList();
        Collection collection = momentSendImageAdapter.f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(collection, "getData(...)");
        int i2 = 0;
        MomentSelectMedia momentSelectMedia = null;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MomentSelectMedia momentSelectMedia2 = (MomentSelectMedia) obj;
            o0000O00.OooO0O0("WRM showBigImage itemModel = " + momentSelectMedia2);
            if (i2 == i) {
                momentSelectMedia = momentSelectMedia2;
            }
            if (momentSelectMedia2 != null && !TextUtils.isEmpty(momentSelectMedia2.getPath())) {
                imagePathList.add(momentSelectMedia2.getPath());
            }
            i2 = i3;
        }
        long duration = momentSelectMedia != null ? momentSelectMedia.getDuration() : 0L;
        MomentSendActivity activity = momentSendImageAdapter.f25972OooOoo0;
        if (duration <= 0) {
            o0oo0000.OooO00o.OooO0OO("106106", MapsKt.mapOf(TuplesKt.to("type", 2)));
            int i4 = PreviewImageActivity.f22065OooO0o0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(imagePathList, "imagePathList");
            Intent intent = new Intent(activity, (Class<?>) PreviewImageActivity.class);
            intent.putExtra("File_Index", i);
            intent.putExtra("data", imagePathList);
            activity.startActivity(intent);
            return;
        }
        o0oo0000.OooO00o.OooO0OO("106106", MapsKt.mapOf(TuplesKt.to("type", 1)));
        int i5 = ExoPlayVideoActivity.f25594OooO0o;
        String source = momentSelectMedia != null ? momentSelectMedia.getPath() : null;
        Intrinsics.checkNotNull(source);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Intent intent2 = new Intent(activity, (Class<?>) ExoPlayVideoActivity.class);
        intent2.putExtra("source_uri", source);
        activity.startActivity(intent2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01df  */
    /* JADX WARN: Code duplicated, block: B:88:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) throws Throwable {
        InputStream fileInputStream;
        String str;
        boolean z;
        NetImageView netImageView;
        Uri uriOooO0O0;
        o00O0OO.OooO00o oooO00o;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentSelectMedia item = (MomentSelectMedia) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = helper.getItemViewType();
        if (itemViewType == MomentSendMediaType.Video.getValue()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(o0OO00O.item_moment_send_video_layout);
            NetImageView netImageView2 = (NetImageView) helper.getView(o0OO00O.item_moment_send_video_image);
            Intrinsics.checkNotNull(netImageView2);
            o000O.OooO(netImageView2, new o000000(this, helper));
            o00O0OO.OooO00o oooO00o2 = o00O0OO.f46706OooO00o;
            p494o0o00OOo.oo0o0Oo oo0o0oo = new p494o0o00OOo.oo0o0Oo(item, constraintLayout, netImageView2, this);
            Intrinsics.checkNotNullParameter(item, "<this>");
            double width = ((double) item.getWidth()) / ((double) item.getHeight());
            if (width <= 0.6666666666666666d) {
                oooO00o = o00O0OO.f46706OooO00o;
            } else if (0.6666666666666666d >= width || width >= 1.0d) {
                boolean z2 = width == 1.0d;
                o00O0OO.OooO00o oooO00o3 = o00O0OO.f46708OooO0OO;
                if (z2) {
                    oooO00o = oooO00o3;
                } else if (1.5d > width && width > 1.0d) {
                    oooO00o = o00O0OO.f46709OooO0Oo;
                } else if (width >= 1.5d) {
                    oooO00o = o00O0OO.f46710OooO0o0;
                } else {
                    oooO00o = oooO00o3;
                }
            } else {
                oooO00o = o00O0OO.f46707OooO0O0;
            }
            oo0o0oo.invoke(oooO00o);
            ImageView imageView = (ImageView) helper.getView(o0OO00O.item_moment_send_video_del);
            imageView.setVisibility(0);
            Intrinsics.checkNotNull(imageView);
            o000O.OooO(imageView, new o0O0O00(this, helper));
            ImageView imageView2 = (ImageView) helper.getView(o0OO00O.item_moment_send_video_play);
            imageView2.setVisibility(0);
            Intrinsics.checkNotNull(imageView2);
            o000O.OooO(imageView2, new o000OOo(this, helper));
            TextView textView = (TextView) helper.getView(o0OO00O.item_moment_send_video_duration);
            textView.setVisibility(0);
            textView.setText("");
            if (item.getDuration() > 0) {
                if (o00O00OO.OooO0Oo(item.getPath())) {
                    textView.setText(TimeStringUtilKt.formatDurationTime(item.getDuration() / 1000));
                    return;
                } else {
                    textView.setText(TimeStringUtilKt.formatDurationTime(item.getDuration()));
                    return;
                }
            }
            return;
        }
        if (itemViewType != MomentSendMediaType.Image.getValue()) {
            ImageView imageView3 = (ImageView) helper.getView(o0OO00O.item_moment_send_add);
            imageView3.setVisibility(0);
            imageView3.setImageResource(o0Oo0oo.icon_photo_add);
            Intrinsics.checkNotNull(imageView3);
            o000O.OooO(imageView3, new o0OOO0o(this));
            return;
        }
        ImageView imageView4 = (ImageView) helper.getView(o0OO00O.item_moment_send_image_del);
        imageView4.setVisibility(0);
        Intrinsics.checkNotNull(imageView4);
        o000O.OooO(imageView4, new p494o0o00OOo.o0Oo0oo(item, this, helper));
        TextView textView2 = (TextView) helper.getView(o0OO00O.item_moment_send_image_gif);
        textView2.setVisibility(8);
        String upperCase = item.getPath().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        ?? context = textView2.getContext();
        HashMap<String, String> map = o00000.f57341OooO00o;
        ?? r7 = 0;
        strOooO00o = null;
        String strOooO00o = null;
        try {
            try {
                fileInputStream = (Build.VERSION.SDK_INT < 29 || (uriOooO0O0 = b3.OooO0O0(context, upperCase)) == null) ? new FileInputStream(upperCase) : context.getContentResolver().openInputStream(uriOooO0O0);
                try {
                    byte[] bArr = new byte[4];
                    fileInputStream.read(bArr, 0, 4);
                    strOooO00o = o00000.OooO00o(bArr);
                    context = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    context = fileInputStream;
                    if (fileInputStream != null) {
                    }
                    str = map.get(TextUtils.isEmpty(strOooO00o) ? "" : strOooO00o.toUpperCase());
                    if (TextUtils.isEmpty(str)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        textView2.setVisibility(0);
                    }
                    netImageView = (NetImageView) helper.getView(o0OO00O.item_moment_send_image_image);
                    netImageView.setVisibility(0);
                    if (o00O00OO.OooO0Oo(item.getPath())) {
                        Oooo000.OooO00o oooO00o4 = new Oooo000.OooO00o(netImageView.getContext());
                        oooO00o4.OooO00o(d1.OooO0Oo());
                        oooO00o4.f43151OooOoo0 = 2;
                        oooO00o4.f43141OooOOoo = 1;
                        oooO00o4.OooO0o0(6);
                        oooO00o4.f43126OooO0OO = item.getPath();
                        oooO00o4.f43124OooO00o = 0;
                        oooO00o4.f43129OooO0o0 = true;
                        oooO00o4.OooO0Oo(netImageView);
                    } else {
                        Oooo000.OooO00o oooO00o5 = new Oooo000.OooO00o(netImageView.getContext());
                        oooO00o5.OooO00o(d1.OooO0Oo());
                        oooO00o5.f43126OooO0OO = item.getPath();
                        oooO00o5.f43124OooO00o = 0;
                        oooO00o5.OooO0o0(6);
                        oooO00o5.OooO0Oo(netImageView);
                    }
                    Intrinsics.checkNotNull(netImageView);
                    o000O.OooO(netImageView, new p494o0o00OOo.o0OO00O(this, helper));
                }
            } catch (Throwable th) {
                th = th;
                r7 = context;
                if (r7 != 0) {
                    try {
                        r7.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        try {
            context.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        str = map.get(TextUtils.isEmpty(strOooO00o) ? "" : strOooO00o.toUpperCase());
        if (TextUtils.isEmpty(str) || !"gif".equals(str.toLowerCase())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            textView2.setVisibility(0);
        }
        netImageView = (NetImageView) helper.getView(o0OO00O.item_moment_send_image_image);
        netImageView.setVisibility(0);
        if (o00O00OO.OooO0Oo(item.getPath())) {
            Oooo000.OooO00o oooO00o6 = new Oooo000.OooO00o(netImageView.getContext());
            oooO00o6.OooO00o(d1.OooO0Oo());
            oooO00o6.f43151OooOoo0 = 2;
            oooO00o6.f43141OooOOoo = 1;
            oooO00o6.OooO0o0(6);
            oooO00o6.f43126OooO0OO = item.getPath();
            oooO00o6.f43124OooO00o = 0;
            oooO00o6.f43129OooO0o0 = true;
            oooO00o6.OooO0Oo(netImageView);
        } else {
            Oooo000.OooO00o oooO00o7 = new Oooo000.OooO00o(netImageView.getContext());
            oooO00o7.OooO00o(d1.OooO0Oo());
            oooO00o7.f43126OooO0OO = item.getPath();
            oooO00o7.f43124OooO00o = 0;
            oooO00o7.OooO0o0(6);
            oooO00o7.OooO0Oo(netImageView);
        }
        Intrinsics.checkNotNull(netImageView);
        o000O.OooO(netImageView, new p494o0o00OOo.o0OO00O(this, helper));
    }
}
