package p541o0o0Oo0o;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.selectPicture.activity.ShowImagesLoadActivity;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p155o00OoO.OooO0O0;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p206o00o0o0o.o000Oo0;
import p522o0o0O0o.o00O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O00o0 extends OooO0OO<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f44167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f44168OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f44169OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f44170OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(@NotNull MomentSendActivity activity, @NotNull List<String> data) {
        super(activity, R.layout.item_send_post_image, data);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44167OooO00o = activity;
    }

    public static final void OooO00o(o00O00o0 o00o00o1, int i) {
        Objects.requireNonNull(o00o00o1);
        ArrayList arrayList = new ArrayList();
        for (String str : o00o00o1.getData()) {
            if (str != null && !TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        MomentSendActivity momentSendActivity = o00o00o1.f44167OooO00o;
        int i2 = ShowImagesLoadActivity.f12276OoooO0O;
        Intent intent = new Intent(momentSendActivity, (Class<?>) ShowImagesLoadActivity.class);
        intent.putExtra("File_Index", i);
        intent.putExtra("data", arrayList);
        intent.putExtra("IsImageViewFinishActivity", true);
        momentSendActivity.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:41:0x014d  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) throws Throwable {
        InputStream fileInputStream;
        String str;
        String upperCase;
        String str2;
        boolean z;
        Uri uriOooO0OO;
        String string;
        Uri uriOooO0Oo;
        OooO0o helper = (OooO0o) oooO00o;
        String item = (String) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        MomentSendActivity context = this.f44167OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        int iOooO00o = OooOo00.OooO00o(105.0f);
        int iOooO00o2 = OooOo00.OooO00o(105.0f);
        View viewOooO0Oo = helper.OooO0Oo(R.id.item_send_post_image_layout);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.item_send_post_image_layout)");
        RelativeLayout relativeLayout = (RelativeLayout) viewOooO0Oo;
        View viewOooO0Oo2 = helper.OooO0Oo(R.id.item_send_post_image_add);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView(R.id.item_send_post_image_add)");
        ImageView imageView = (ImageView) viewOooO0Oo2;
        View viewOooO0Oo3 = helper.OooO0Oo(R.id.item_send_post_image_gif);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo3, "helper.getView(R.id.item_send_post_image_gif)");
        TextView textView = (TextView) viewOooO0Oo3;
        View viewOooO0Oo4 = helper.OooO0Oo(R.id.item_send_post_image_image);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView(R.id.item_send_post_image_image)");
        NetImageView netImageView = (NetImageView) viewOooO0Oo4;
        View viewOooO0Oo5 = helper.OooO0Oo(R.id.item_send_post_image_iv_del);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo5, "helper.getView(R.id.item_send_post_image_iv_del)");
        ImageView imageView2 = (ImageView) viewOooO0Oo5;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.height = iOooO00o2;
        layoutParams.width = iOooO00o2;
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setOnClickListener(new o00O00(item, this, helper));
        imageView.setOnClickListener(new o00O00O(this));
        netImageView.setOnClickListener(new oOO00O(this, helper));
        imageView2.setOnClickListener(new o00O00OO(this, helper));
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.width = iOooO00o;
        layoutParams3.height = iOooO00o2;
        relativeLayout.setLayoutParams(layoutParams3);
        imageView.setVisibility(8);
        InputStream inputStream = null;
        strOooO00o = null;
        String strOooO00o = null;
        netImageView.setImageDrawable(null);
        netImageView.setVisibility(8);
        textView.setVisibility(8);
        imageView2.setVisibility(8);
        if (item != null) {
            if (TextUtils.isEmpty(item)) {
                imageView.setVisibility(0);
                netImageView.setImageResource(R.drawable.icon_photo_add);
                return;
            }
            netImageView.setVisibility(0);
            netImageView.setImageResource(R.drawable.icon_picture_default);
            String upperCase2 = item.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            HashMap<String, String> map = OooO0O0.f32343OooO00o;
            try {
                fileInputStream = (Build.VERSION.SDK_INT < 29 || (uriOooO0Oo = o00OOO0O.OooO00o.OooO0Oo(context, upperCase2)) == null) ? new FileInputStream(upperCase2) : context.getContentResolver().openInputStream(uriOooO0Oo);
                try {
                    try {
                        byte[] bArr = new byte[4];
                        fileInputStream.read(bArr, 0, 4);
                        strOooO00o = OooO0O0.OooO00o(bArr);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                        }
                        str = "";
                        if (TextUtils.isEmpty(strOooO00o)) {
                            upperCase = "";
                        } else {
                            upperCase = strOooO00o.toUpperCase();
                        }
                        str2 = map.get(upperCase);
                        if (TextUtils.isEmpty(str2)) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            textView.setVisibility(0);
                        }
                        imageView2.setVisibility(0);
                        if (o00O0.OooO0Oo(item)) {
                            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(context);
                            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o2.f48454OooOoo0 = 2;
                            oooO00o2.f48444OooOOoo = 1;
                            oooO00o2.OooO0oO(6);
                            oooO00o2.f48429OooO0OO = item;
                            oooO00o2.f48427OooO00o = 0;
                            oooO00o2.f48432OooO0o0 = true;
                            oooO00o2.OooO0o(netImageView);
                            return;
                        }
                        uriOooO0OO = o000Oo0.OooO0OO(context, item);
                        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(context);
                        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o());
                        if (uriOooO0OO != null) {
                            str = string;
                        }
                        oooO00o3.f48429OooO0OO = str;
                        oooO00o3.f48427OooO00o = 0;
                        oooO00o3.OooO0oO(6);
                        oooO00o3.OooO0o(netImageView);
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = fileInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
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
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
            try {
                fileInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            str = "";
            if (TextUtils.isEmpty(strOooO00o)) {
                upperCase = "";
            } else {
                upperCase = strOooO00o.toUpperCase();
            }
            str2 = map.get(upperCase);
            if (TextUtils.isEmpty(str2) || !"gif".equals(str2.toLowerCase())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                textView.setVisibility(0);
            }
            imageView2.setVisibility(0);
            if (o00O0.OooO0Oo(item)) {
                oO0O00.OooO00o oooO00o4 = new oO0O00.OooO00o(context);
                oooO00o4.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o4.f48454OooOoo0 = 2;
                oooO00o4.f48444OooOOoo = 1;
                oooO00o4.OooO0oO(6);
                oooO00o4.f48429OooO0OO = item;
                oooO00o4.f48427OooO00o = 0;
                oooO00o4.f48432OooO0o0 = true;
                oooO00o4.OooO0o(netImageView);
                return;
            }
            uriOooO0OO = o000Oo0.OooO0OO(context, item);
            oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(context);
            oooO00o5.OooO00o(o00OOO.OooO00o.OooO0o());
            if (uriOooO0OO != null && (string = uriOooO0OO.toString()) != null) {
                str = string;
            }
            oooO00o5.f48429OooO0OO = str;
            oooO00o5.f48427OooO00o = 0;
            oooO00o5.OooO0oO(6);
            oooO00o5.OooO0o(netImageView);
        }
    }
}
