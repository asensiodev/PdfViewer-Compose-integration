package com.asensio.pdf_demo

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.github.barteksc.pdfviewer.PDFView
import java.io.InputStream

@Composable
fun PDFViewer(
    path: Int
) {
    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(
                R.layout.pdf_view,
                null
            )
        },
        update = { view ->
            val pdfView = view.findViewById<PDFView>(R.id.pdf_view)
            val pdfInputStream: InputStream = view.resources.openRawResource(path)
            pdfView.fromStream(pdfInputStream).load()
        }
    )
}