package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.ui.OooOOO;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.oo000o;
import com.twitter.Extractor;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.OooO00o;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Matcher;
import p350o0OOOOoo.o000OOo;
import p350o0OOOOoo.o0O0O00;
import p350o0OOOOoo.o0OO00O;
import p350o0OOOOoo.o0OOO0o;
import p350o0OOOOoo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class ComposerView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ObservableScrollView f21764OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ImageView f21765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public EditText f21766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f21767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f21768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Button f21769OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View f21770OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ColorDrawable f21771OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ImageView f21772OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Picasso f21773OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0280OooO00o f21774OooOOO0;

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int iCodePointCount;
            ?? EmptyList;
            ComposerView composerView = ComposerView.this;
            com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0280OooO00o interfaceC0280OooO00o = composerView.f21774OooOOO0;
            String tweetText = composerView.getTweetText();
            com.twitter.sdk.android.tweetcomposer.OooO00o oooO00o = com.twitter.sdk.android.tweetcomposer.OooO00o.this;
            oooO00o.getClass();
            boolean z = false;
            if (TextUtils.isEmpty(tweetText)) {
                iCodePointCount = 0;
            } else {
                com.twitter.OooO00o oooO00o2 = oooO00o.f21780OooO0o0.f21782OooO00o;
                oooO00o2.getClass();
                String strNormalize = Normalizer.normalize(tweetText, Normalizer.Form.NFC);
                iCodePointCount = strNormalize.codePointCount(0, strNormalize.length());
                oooO00o2.f21486OooO00o.getClass();
                if (strNormalize.length() == 0 || strNormalize.indexOf(46) == -1) {
                    EmptyList = Collections.emptyList();
                } else {
                    EmptyList = new ArrayList();
                    Matcher matcher = o0OOOOO0.OooO00o.f42814OooO00o.matcher(strNormalize);
                    while (matcher.find()) {
                        if (matcher.group(4) != null || !o0OOOOO0.OooO00o.f42816OooO0OO.matcher(matcher.group(2)).matches()) {
                            String strGroup = matcher.group(3);
                            int iStart = matcher.start(3);
                            int iEnd = matcher.end(3);
                            Matcher matcher2 = o0OOOOO0.OooO00o.f42815OooO0O0.matcher(strGroup);
                            if (matcher2.find()) {
                                strGroup = matcher2.group();
                                iEnd = strGroup.length() + iStart;
                            }
                            EmptyList.add(new Extractor.Entity(iStart, iEnd, strGroup, Extractor.Entity.Type.URL));
                        }
                    }
                }
                for (Extractor.Entity entity : EmptyList) {
                    int i = (entity.f21482OooO00o - entity.f21483OooO0O0) + iCodePointCount;
                    entity.f21484OooO0OO.toLowerCase().startsWith("https://");
                    iCodePointCount = i + 23;
                }
            }
            ComposerView composerView2 = oooO00o.f21776OooO00o;
            composerView2.setCharCount(140 - iCodePointCount);
            if (iCodePointCount > 140) {
                composerView2.setCharCountTextStyle(o000OOo.tw__ComposerCharCountOverflow);
            } else {
                composerView2.setCharCountTextStyle(o000OOo.tw__ComposerCharCount);
            }
            if (iCodePointCount > 0 && iCodePointCount <= 140) {
                z = true;
            }
            composerView2.f21769OooO0oo.setEnabled(z);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ComposerView(Context context) {
        this(context, null);
    }

    public final void OooO00o(Context context) {
        this.f21773OooOOO = Picasso.OooO0o(getContext());
        this.f21771OooOO0O = new ColorDrawable(context.getResources().getColor(o0OO00O.tw__composer_light_gray));
        View.inflate(context, o0O0O00.tw__composer_view, this);
    }

    public String getTweetText() {
        return this.f21766OooO0o.getText().toString();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f21765OooO0Oo = (ImageView) findViewById(oo0o0Oo.tw__author_avatar);
        this.f21767OooO0o0 = (ImageView) findViewById(oo0o0Oo.tw__composer_close);
        this.f21766OooO0o = (EditText) findViewById(oo0o0Oo.tw__edit_tweet);
        this.f21768OooO0oO = (TextView) findViewById(oo0o0Oo.tw__char_count);
        this.f21769OooO0oo = (Button) findViewById(oo0o0Oo.tw__post_tweet);
        this.f21764OooO = (ObservableScrollView) findViewById(oo0o0Oo.tw__composer_scroll_view);
        this.f21770OooOO0 = findViewById(oo0o0Oo.tw__composer_profile_divider);
        this.f21772OooOO0o = (ImageView) findViewById(oo0o0Oo.tw__image_view);
        this.f21767OooO0o0.setOnClickListener(new OooOOO(this, 1));
        this.f21769OooO0oo.setOnClickListener(new View.OnClickListener() { // from class: o0OOOOoo.o00oO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComposerView composerView = this.f42854OooO0Oo;
                ((OooO00o.OooO0O0) composerView.f21774OooOOO0).OooO00o(composerView.getTweetText());
            }
        });
        this.f21766OooO0o.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0OOOOoo.o0ooOOo
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                ComposerView composerView = this.f42856OooO00o;
                ((OooO00o.OooO0O0) composerView.f21774OooOOO0).OooO00o(composerView.getTweetText());
                return true;
            }
        });
        this.f21766OooO0o.addTextChangedListener(new OooO00o());
        this.f21764OooO.setScrollViewListener(new o0OOO0o(this));
    }

    public void setCallbacks(com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0280OooO00o interfaceC0280OooO00o) {
        this.f21774OooOOO0 = interfaceC0280OooO00o;
    }

    public void setCharCount(int i) {
        this.f21768OooO0oO.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
    }

    public void setCharCountTextStyle(int i) {
        this.f21768OooO0oO.setTextAppearance(getContext(), i);
    }

    public void setImageView(Uri uri) {
        if (this.f21773OooOOO != null) {
            this.f21772OooOO0o.setVisibility(0);
            Picasso picasso = this.f21773OooOOO;
            picasso.getClass();
            new oo000o(picasso, uri).OooO0O0(this.f21772OooOO0o, null);
        }
    }

    public void setProfilePhotoView(User user) {
        String strOooO00o = UserUtils.OooO00o(user, UserUtils.AvatarSize.REASONABLY_SMALL);
        Picasso picasso = this.f21773OooOOO;
        if (picasso != null) {
            oo000o oo000oVarOooO0Oo = picasso.OooO0Oo(strOooO00o);
            oo000oVarOooO0Oo.f21381OooO0o0 = this.f21771OooOO0O;
            oo000oVarOooO0Oo.OooO0O0(this.f21765OooO0Oo, null);
        }
    }

    public void setTweetText(String str) {
        this.f21766OooO0o.setText(str);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o(context);
    }
}
