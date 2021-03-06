package com.myappcompany.doglistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.myappcompany.doglistapp.databinding.FragmentDogDetailsBinding

class DogDetailsFragment: androidx.fragment.app.Fragment() {

    companion object {

        private const val DOGMODEL = "model"

        fun newInstance(dogModel: DogModel): DogDetailsFragment {
            val args = Bundle()
            args.putSerializable(DOGMODEL, dogModel)
            val fragment = DogDetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentDogDetailsBinding = FragmentDogDetailsBinding.inflate(inflater, container, false)

        val model = arguments!!.getSerializable(DOGMODEL) as DogModel
        fragmentDogDetailsBinding.dogModel = model
        model.text = String.format(getString(R.string.description_format), model.description, model.url)
        return fragmentDogDetailsBinding.root
    }
}
