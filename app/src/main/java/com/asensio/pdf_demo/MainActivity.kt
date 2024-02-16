package com.asensio.pdf_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.asensio.pdf_demo.ui.theme.PDF_DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PDF_DemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val singlePagePdf = R.raw.sample_pdf_single_page
                    val multiplePagesPdf = R.raw.sample_pdf_multiple_pages
                    PDFViewer(path = multiplePagesPdf)
                }
            }
        }
    }
}