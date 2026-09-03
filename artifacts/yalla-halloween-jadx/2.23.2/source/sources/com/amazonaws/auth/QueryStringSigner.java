package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import p037OoooOo0.o000O0o;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class QueryStringSigner extends AbstractAWSSigner {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.amazonaws.auth.Signer
    public final void OooO0OO(DefaultRequest defaultRequest, AWSCredentials aWSCredentials) {
        String string;
        SignatureVersion signatureVersion = SignatureVersion.V2;
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0 = AbstractAWSSigner.OooOO0(aWSCredentials);
        defaultRequest.OooO0O0("AWSAccessKeyId", aWSCredentialsOooOO0.OooO00o());
        defaultRequest.OooO0O0("SignatureVersion", signatureVersion.toString());
        int iOooO = AbstractAWSSigner.OooO(defaultRequest);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        defaultRequest.OooO0O0("Timestamp", simpleDateFormat.format(AbstractAWSSigner.OooO0oo(iOooO)));
        if (aWSCredentialsOooOO0 instanceof AWSSessionCredentials) {
            defaultRequest.OooO0O0("SecurityToken", ((AWSSessionCredentials) aWSCredentialsOooOO0).OooO0O0());
        }
        boolean zEquals = signatureVersion.equals(SignatureVersion.V1);
        LinkedHashMap linkedHashMap = defaultRequest.f12068OooO0OO;
        if (zEquals) {
            StringBuilder sb = new StringBuilder();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(linkedHashMap);
            for (Map.Entry entry : treeMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append((String) entry.getValue());
            }
            string = sb.toString();
        } else {
            if (!signatureVersion.equals(signatureVersion)) {
                throw new AmazonClientException("Invalid Signature Version specified");
            }
            defaultRequest.OooO0O0("SignatureMethod", signingAlgorithm.toString());
            URI uri = defaultRequest.f12071OooO0o0;
            StringBuilder sb2 = new StringBuilder("POST\n");
            String strOooO00o = StringUtils.OooO00o(uri.getHost());
            if (HttpUtils.OooO0OO(uri)) {
                StringBuilder sbOooO0O0 = o000O0o.OooO0O0(strOooO00o, CertificateUtil.DELIMITER);
                sbOooO0O0.append(uri.getPort());
                strOooO00o = sbOooO0O0.toString();
            }
            sb2.append(strOooO00o);
            sb2.append("\n");
            String strConcat = defaultRequest.f12071OooO0o0.getPath() != null ? "" + defaultRequest.f12071OooO0o0.getPath() : "";
            if (defaultRequest.f12066OooO00o != null) {
                if (strConcat.length() > 0 && !strConcat.endsWith("/") && !defaultRequest.f12066OooO00o.startsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                StringBuilder sbOooO00o = o0o0Oo.OooO00o(strConcat);
                sbOooO00o.append(defaultRequest.f12066OooO00o);
                strConcat = sbOooO00o.toString();
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            if (!strConcat.startsWith("/")) {
                strConcat = "/".concat(strConcat);
            }
            if (strConcat.startsWith("//")) {
                strConcat = strConcat.substring(1);
            }
            sb2.append(strConcat);
            sb2.append("\n");
            sb2.append(AbstractAWSSigner.OooO0o(linkedHashMap));
            string = sb2.toString();
        }
        defaultRequest.OooO0O0("Signature", AbstractAWSSigner.OooOOO0(signingAlgorithm, aWSCredentialsOooOO0.OooO0OO(), string.getBytes(StringUtils.f12681OooO00o)));
    }
}
