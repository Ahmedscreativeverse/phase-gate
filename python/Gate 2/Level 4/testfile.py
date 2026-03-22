 
 
 
 from unittest import TestCase
 
 import functionfile 
 
 
 class TestForAddition(TestCase):
 
    def test_for_addition_of_numbers (self):
    
        actual = functionfile.get_addition_of_numbers(2,2)
        
        expected = 4
        
        self.assertEqual(expected, actual)
